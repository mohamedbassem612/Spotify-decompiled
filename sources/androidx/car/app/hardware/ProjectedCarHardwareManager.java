package androidx.car.app.hardware;

import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Accelerometer;
import androidx.car.app.hardware.info.CarHardwareLocation;
import androidx.car.app.hardware.info.Compass;
import androidx.car.app.hardware.info.EnergyLevel;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.EvStatus;
import androidx.car.app.hardware.info.Gyroscope;
import androidx.car.app.hardware.info.Mileage;
import androidx.car.app.hardware.info.Model;
import androidx.car.app.hardware.info.Speed;
import androidx.car.app.hardware.info.TollCard;
import androidx.car.app.k;
import androidx.car.app.l;
import java.util.HashMap;
import java.util.List;
import p.d6y;
import p.e6y;
import p.f1f1;
import p.frd;
import p.gvz;
import p.ird;
import p.kkx0;
import p.mkx0;
import p.opd;
import p.qrd;
import p.srd;
import p.whg0;
import p.xpa1;
import p.yfm0;
import p.zrj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class ProjectedCarHardwareManager implements whg0 {
    private final kkx0 mVehicleInfo;
    private final mkx0 mVehicleSensors;

    public ProjectedCarHardwareManager(k kVar, l lVar) {
        frd frdVar = new frd(lVar);
        kkx0 kkx0Var = new kkx0();
        yfm0 yfm0Var = new yfm0();
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        yfm0Var.a = carValue;
        CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
        yfm0Var.b = carValue2;
        yfm0Var.c = carValue;
        new CarResultStub(1, null, true, new Model(yfm0Var), frdVar);
        e6y e6yVar = new e6y();
        CarValue<List<Integer>> carValue3 = CarValue.UNKNOWN_INTEGER_LIST;
        e6yVar.a = carValue3;
        e6yVar.b = carValue3;
        new CarResultStub(2, null, true, new EnergyProfile(e6yVar), frdVar);
        f1f1 f1f1Var = new f1f1();
        f1f1Var.a = carValue2;
        new CarResultStub(3, null, false, new TollCard(f1f1Var), frdVar);
        d6y d6yVar = new d6y();
        CarValue<Float> carValue4 = CarValue.UNKNOWN_FLOAT;
        d6yVar.a = carValue4;
        d6yVar.b = carValue4;
        CarValue<Boolean> carValue5 = CarValue.UNKNOWN_BOOLEAN;
        d6yVar.c = carValue5;
        d6yVar.d = carValue4;
        d6yVar.e = carValue2;
        d6yVar.f = carValue2;
        new CarResultStub(4, null, false, new EnergyLevel(d6yVar), frdVar);
        xpa1 xpa1Var = new xpa1();
        xpa1Var.a = carValue4;
        xpa1Var.b = carValue4;
        xpa1Var.c = carValue2;
        new CarResultStub(5, null, false, new Speed(xpa1Var), frdVar);
        zrj0 zrj0Var = new zrj0();
        zrj0Var.a = carValue4;
        zrj0Var.b = carValue2;
        new CarResultStub(6, null, false, new Mileage(zrj0Var), frdVar);
        gvz gvzVar = new gvz();
        gvzVar.a = carValue5;
        gvzVar.b = carValue5;
        new CarResultStub(7, null, false, new EvStatus(gvzVar), frdVar);
        this.mVehicleInfo = kkx0Var;
        mkx0 mkx0Var = new mkx0();
        CarValue carValue6 = mkx0.a;
        new Accelerometer(carValue6);
        new HashMap();
        new Gyroscope(carValue6);
        new HashMap();
        new Compass(carValue6);
        new HashMap();
        new CarHardwareLocation(new CarValue(null, 0L, 2));
        new HashMap();
        this.mVehicleSensors = mkx0Var;
    }

    public opd getCarClimate() {
        throw new UnsupportedOperationException();
    }

    public ird getCarInfo() {
        return this.mVehicleInfo;
    }

    public srd getCarSensors() {
        return this.mVehicleSensors;
    }
}
