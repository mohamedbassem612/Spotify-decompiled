package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class btf1 {
    public final uu00 a;

    public btf1(uu00 uu00Var) {
        this.a = uu00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object a(String str, String str2, onm onmVar, boolean z) {
        atf1 atf1Var;
        boolean z2;
        List list;
        String str3 = str;
        if (onmVar instanceof atf1) {
            atf1Var = (atf1) onmVar;
            int i = atf1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                atf1Var.e = i - Integer.MIN_VALUE;
            } else {
                atf1Var = new atf1(this, onmVar);
            }
        } else {
            atf1Var = new atf1(this, onmVar);
        }
        Object objJ = atf1Var.c;
        int i2 = atf1Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (str3.length() == 0) {
                    return new xlj0(new ulj0("Entity URI cannot be empty"));
                }
                ezc ezcVarG = yoi1.g(this.a.b(new oi(str2, new cl1(str3, z, (byte) 28))));
                q1c1 q1c1Var = new q1c1();
                atf1Var.a = str3;
                atf1Var.b = z;
                atf1Var.e = 1;
                objJ = b5p1.j(ezcVarG, q1c1Var, atf1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                z2 = z;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = atf1Var.b;
                str3 = atf1Var.a;
                hm5.M(objJ);
            }
            uv00 uv00Var = (uv00) objJ;
            jo70 jo70Var = uv00Var.a(jo70.class, str3).b;
            hll hllVar = uv00Var.a(hll.class, str3).b;
            if (jo70Var == null) {
                return new xlj0(new wlj0("No IdentityTrait found for URI: ".concat(str3)));
            }
            if (z2 && hllVar == null) {
                return new xlj0(new wlj0("No ConsumptionExperienceTrait found for URI: ".concat(str3)));
            }
            String str4 = jo70Var.a;
            String strY0 = o7h.y0(jo70Var.d, ", ", null, null, bpf1.X0, 30);
            if (hllVar == null || (list = hllVar.b) == null) {
                list = z6x.a;
            }
            io70 io70Var = jo70Var.e;
            return new ylj0(new xsf1(str4, list, strY0, io70Var != null ? io70Var.a : null));
        } catch (Exception e) {
            e.toString();
            return new xlj0(new vlj0(l1d.m("Failed to fetch metadata: ", e.getMessage())));
        }
    }
}
