package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d16 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d16(nfa0 nfa0Var, byte b) {
        super(1);
        this.a = b;
        this.b = nfa0Var;
    }

    public final Object invoke(Object obj) {
        m231 m231Var;
        m231 m231Var2;
        m231 m231Var3;
        byte b = this.a;
        nfa0 nfa0Var = this.b;
        switch (b) {
            case 0:
                byte[] bArr = (byte[]) o7h.s0(((c8r) obj).c);
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    bArr = null;
                }
                if (bArr == null) {
                    return null;
                }
                try {
                    m231Var = (c16) nfa0Var.a(nhc1.P(bArr), c16.Companion.serializer());
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    n57.t("hm://users-nearby-service/v1/approval-granted payload parse failure", thA);
                }
                return (c16) (m231Var instanceof m231 ? null : m231Var);
            case 1:
                byte[] bArr2 = (byte[]) o7h.s0(((c8r) obj).c);
                if (bArr2 == null) {
                    return null;
                }
                if (bArr2.length == 0) {
                    bArr2 = null;
                }
                if (bArr2 == null) {
                    return null;
                }
                try {
                    m231Var2 = (b5o0) nfa0Var.a(nhc1.P(bArr2), b5o0.Companion.serializer());
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var2);
                if (thA2 != null) {
                    n57.t("hm://users-nearby-service/v1/nearby-user-found payload parse failure", thA2);
                }
                return (b5o0) (m231Var2 instanceof m231 ? null : m231Var2);
            default:
                byte[] bArr3 = (byte[]) o7h.s0(((c8r) obj).c);
                if (bArr3 == null) {
                    return null;
                }
                if (bArr3.length == 0) {
                    bArr3 = null;
                }
                if (bArr3 == null) {
                    return null;
                }
                try {
                    m231Var3 = (wd61) nfa0Var.a(nhc1.P(bArr3), wd61.Companion.serializer());
                    break;
                } catch (Throwable th3) {
                    m231Var3 = new m231(th3);
                }
                Throwable thA3 = e331.a(m231Var3);
                if (thA3 != null) {
                    n57.t("hm://users-nearby-service/v1/session-dismissed payload parse failure", thA3);
                }
                return (wd61) (m231Var3 instanceof m231 ? null : m231Var3);
        }
    }
}
