package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class te00 extends hab0 implements iu30 {
    public final /* synthetic */ ue00 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ t561 d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ s900 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te00(ue00 ue00Var, String str, byte[] bArr, t561 t561Var, byte[] bArr2, s900 s900Var, zq4 zq4Var, boolean z, String str2, String str3, long j) {
        super(1);
        this.a = ue00Var;
        this.b = str;
        this.c = bArr;
        this.d = t561Var;
        this.e = bArr2;
        this.f = s900Var;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.t = j;
    }

    public final Object invoke(Object obj) {
        ue00 ue00Var = this.a;
        ue00Var.getClass();
        String str = this.h;
        String strU = str != null ? b3o1.u(str) : null;
        ba00 ba00Var = new ba00();
        String str2 = this.b;
        ba00Var.c = str2;
        ba00Var.g = strU;
        ba00Var.b = Boolean.valueOf(this.g);
        byte[] bArr = this.e;
        ba00Var.d = bArr;
        ba00Var.h = this.i;
        ba00Var.f = q1o1.e(this.c, this.t, this.f).toByteArray();
        t561 t561Var = this.d;
        long jA = t561Var.a(1, str2, bArr);
        ba00Var.e = jA;
        long jLongValue = ((Number) qyo1.x(ue00Var.b, false, true, new f0z(ue00Var, ba00Var, (byte) 16))).longValue();
        Long l = ue00Var.a;
        if (l != null && l.longValue() >= jLongValue) {
            eg.m("DB is overriding saved events for event ".concat(str2));
            return null;
        }
        ue00Var.a = Long.valueOf(jLongValue);
        if (t561Var.b(str2, bArr) != jA) {
            return rih1.a;
        }
        eg.m("DB is overriding saved sequence numbers for event ".concat(str2));
        return null;
    }
}
