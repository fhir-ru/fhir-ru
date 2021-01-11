THISDIR=`pwd`
cd ..
rm -rf build-fhir
git clone --depth 1 $THISDIR build-fhir
cp  -R $THISDIR/source.ru/* build-fhir/source
cp  -R $THISDIR/guides.ru/* build-fhir/guides
cd build-fhir
./build.sh
