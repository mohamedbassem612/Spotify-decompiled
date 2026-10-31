package p;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vie1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vie1(byte b, Context context, ven0 ven0Var) {
        super(1);
        this.a = b;
        this.b = context;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        SensorManager sensorManager;
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                Object systemService = context.getSystemService("sensor");
                sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager == null) {
                    return new tj4((byte) 23);
                }
                Sensor defaultSensor = sensorManager.getDefaultSensor(9);
                if (defaultSensor == null) {
                    return new tj4((byte) 24);
                }
                uie1 uie1Var = new uie1(new l811(), new m811(), new m811(), new m811(), new m811(), new m811(), new m811(), this.c, (byte) 0);
                sensorManager.registerListener(uie1Var, defaultSensor, 1);
                return new w9d0(sensorManager, uie1Var, (byte) 23);
            default:
                Object systemService2 = context.getSystemService("sensor");
                sensorManager = systemService2 instanceof SensorManager ? (SensorManager) systemService2 : null;
                if (sensorManager == null) {
                    return new tj4((byte) 25);
                }
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
                if (defaultSensor2 == null) {
                    return new tj4((byte) 26);
                }
                uie1 uie1Var2 = new uie1(new l811(), new m811(), new m811(), new m811(), new m811(), new m811(), new m811(), this.c, (byte) 1);
                sensorManager.registerListener(uie1Var2, defaultSensor2, 1);
                return new w9d0(sensorManager, uie1Var2, (byte) 24);
        }
    }
}
