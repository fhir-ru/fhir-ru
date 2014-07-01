THISDIR=`pwd`
cd ..
rm -rf build-fhir
git clone --depth 1 $THISDIR build-fhir
cd build-fhir
cp  -R source.ru/* source
./build.sh
