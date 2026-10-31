package p;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zd41 {
    public static final h661 a;
    public static final h661 b;
    public static final h661 c;
    public static final h661 d;
    public static final k36 e;
    public static final k36 f;
    public static final p36 g;
    public static final p36 h;
    public static final k36 i;
    public static final k36 j;
    public static final p36 k;
    public static final p36 l;
    public static final h661 m;
    public static final h661 n;
    public static final h661 o;

    static {
        jd11 jd11Var = rc11.a;
        a = new tcv0(jd11Var.b(CharSequence.class)).getDescriptor();
        b = new tcv0(jd11Var.b(Parcelable.class)).getDescriptor();
        c = new tcv0(jd11Var.b(Serializable.class)).getDescriptor();
        d = new tcv0(jd11Var.b(IBinder.class)).getDescriptor();
        les lesVar = les.b;
        jd11Var.b(Parcelable.class);
        e = new k36(lesVar.a);
        tcv0 tcv0Var = new tcv0(jd11Var.b(Parcelable.class));
        jd11Var.b(Parcelable.class);
        f = new k36(tcv0Var.getDescriptor());
        g = new p36(lesVar.a, (byte) 0);
        h = new p36(new tcv0(jd11Var.b(Parcelable.class)).getDescriptor(), (byte) 0);
        j661 j661Var = dne.a;
        jd11Var.b(CharSequence.class);
        j661 j661Var2 = dne.a;
        i = new k36(j661Var2);
        tcv0 tcv0Var2 = new tcv0(jd11Var.b(CharSequence.class));
        jd11Var.b(CharSequence.class);
        j = new k36(tcv0Var2.getDescriptor());
        k = new p36(j661Var2, (byte) 0);
        l = new p36(new tcv0(jd11Var.b(CharSequence.class)).getDescriptor(), (byte) 0);
        lna1 lna1Var = mna1.Companion;
        m = lna1Var.serializer(lesVar).getDescriptor();
        n = lna1Var.serializer(new tcv0(jd11Var.b(Parcelable.class))).getDescriptor();
        o = lna1Var.serializer(m5n1.z(new tcv0(jd11Var.b(Parcelable.class)))).getDescriptor();
    }
}
