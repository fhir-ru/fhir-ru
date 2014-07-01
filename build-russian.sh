THISDIR=`pwd`
cd ..
rm -rf build-fhir
git clone --depth 1 $THISDIR build-fhir
cp  -R $THISDIR/source.ru/* build-fhir/source
cd build-fhir
./build.sh
