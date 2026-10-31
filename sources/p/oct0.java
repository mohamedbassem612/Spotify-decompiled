package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class oct0 {
    public static final ir4 a;
    public static final kuw0 b;
    public static final ubc c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new kuw0((byte) 18);
            c = new ubc((byte) 0);
        } else if (property.equals("Dalvik")) {
            a = new ir4();
            b = new pc11();
            c = new tbc((byte) 0);
        } else {
            a = null;
            b = new qc11((byte) 18);
            c = new tbc((byte) 0);
        }
    }
}
