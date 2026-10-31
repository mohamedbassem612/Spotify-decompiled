package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nxx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxx(oud oudVar, boolean z, boolean z2) {
        super(1);
        this.a = (byte) 2;
        b3s b3sVar = b3s.c;
        this.d = oudVar;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        float f = 0.0f;
        rih1 rih1Var = rih1.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                z5v z5vVar = (z5v) obj;
                flb0 flb0Var = (flb0) obj2;
                flb0 flb0Var2 = flb0.a;
                if (z3) {
                    z5vVar.a(flb0Var == flb0Var2 ? 1.0f : -1.0f, w3v.a);
                }
                z5vVar.a(0.0f, w3v.b);
                if (z2) {
                    z5vVar.a(flb0Var == flb0Var2 ? -1.0f : 1.0f, w3v.c);
                }
                return rih1Var;
            case 1:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                if (z3) {
                    yf.p(ubeVar, ((ihl) obj2).g, 24.0f, 4);
                } else if (z2) {
                    yf.p(ubeVar, ihlVar.e, 64.0f, 4);
                } else {
                    yf.p(ubeVar, ihlVar.e, 16.0f, 4);
                }
                xid.r(dhlVar.d, ihlVar.d, 16.0f, 4);
                xid.r(dhlVar.f, ihlVar.f, 16.0f, 4);
                dhlVar.g(new e5u((p3v) null, "spread"));
                return rih1Var;
            case 2:
                cas casVar = (a7m0) obj;
                casVar.a = new xix(z3, z2, (byte) 2);
                casVar.d = i0f0.Z0;
                casVar.e = i0f0.a1;
                casVar.c = new lud((oud) obj2, b3s.c, new fca0(2, (lnm) null, (byte) 13));
                casVar.a(new z8b0(1, (byte) 14), new z8b0(1, (byte) 15));
                return rih1Var;
            case 3:
                xy71 xy71Var = (xy71) obj;
                if (xy71Var == xy71.a) {
                    ((nwb) obj2).a.invoke(Boolean.valueOf(z3));
                    z = z3;
                } else if (xy71Var == xy71.c && !z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return new ne40((String) obj, z3, (String) obj2, z2);
            default:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = ((Number) ((tob1) obj2).getValue()).floatValue();
                if (z3 && z2) {
                    f = 1.0f;
                }
                kd31Var.p(fFloatValue * f);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxx(Object obj, boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxx(boolean z, Object obj, boolean z2, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxx(boolean z, boolean z2, ven0 ven0Var) {
        super(1);
        this.a = (byte) 5;
        this.b = z;
        this.c = z2;
        this.d = ven0Var;
    }
}
