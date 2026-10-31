package p;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f830 implements sdm {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ f830(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object a(oim oimVar, us0 us0Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                g830 g830Var = (g830) oimVar;
                String str = g830Var.a;
                String str2 = g830Var.b;
                String str3 = g830Var.c;
                Uri uri = str3 != null ? Uri.parse(str3) : Uri.EMPTY;
                uri.getClass();
                Set set = s4b1.f;
                String strS = uic.x(str).s();
                if (strS == null) {
                    strS = "";
                }
                igm igmVar = new igm(str2, new wfm(uri, new hgm(strS, str2)), (String) null, 4);
                jhm jhmVarA = ((x621) obj).a(str, str2);
                l6b l6bVar = (l6b) obj2;
                l6bVar.getClass();
                return new kjm(igmVar, p7h.M(new jhm[]{jhmVarA, new jhm("profile_block_user", (hux) tkx.c, (fhm) null, (Integer) 2131959444, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(rza.c1, rza.d1), new oo6(l6bVar, str, str2, (byte) 15)), 244)}), 4);
            case 1:
                return b((i2n1) oimVar, us0Var);
            default:
                s2n1 s2n1Var = (s2n1) oimVar;
                igm igmVar2 = new igm(((Context) obj2).getString(2131964189), (rzn1) null, (String) null, 6);
                j2e0 j2e0Var = (j2e0) obj;
                boolean z = s2n1Var.a;
                String str4 = s2n1Var.b;
                return new kjm(igmVar2, Collections.singletonList(new jhm("your_updates_mark_all_as_read", (hux) ilx.c, (fhm) null, (Integer) 2131964186, (String) null, (!z || str4 == null || str4.length() == 0) ? false : true, (tm81) null, new ihm(new ygm(2), new ghm(new e4f0(j2e0Var, (byte) 23), wlg0.Z0), new j2d0(str4, j2e0Var, (byte) 26)), 180)), 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object b(i2n1 i2n1Var, onm onmVar) {
        h2n1 h2n1Var;
        igm igmVar;
        ufm tfmVar;
        kjo0 kjo0Var;
        Object obj;
        sba sbaVar;
        igm igmVar2;
        i2n1 i2n1Var2 = i2n1Var;
        if (onmVar instanceof h2n1) {
            h2n1Var = (h2n1) onmVar;
            int i = h2n1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                h2n1Var.g = i - Integer.MIN_VALUE;
            } else {
                h2n1Var = new h2n1(this, onmVar);
            }
        } else {
            h2n1Var = new h2n1(this, onmVar);
        }
        Object obj2 = h2n1Var.e;
        int i2 = h2n1Var.g;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                sbaVar = h2n1Var.d;
                igm igmVar3 = h2n1Var.c;
                kjo0 kjo0Var2 = h2n1Var.b;
                i2n1 i2n1Var3 = h2n1Var.a;
                hm5.M(obj2);
                igmVar = igmVar3;
                i2n1Var2 = i2n1Var3;
                kjo0Var = kjo0Var2;
                obj = obj2;
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                igmVar2 = h2n1Var.c;
                hm5.M(obj2);
            }
            return new kjm(igmVar2, (List) obj2, 4);
        }
        hm5.M(obj2);
        kjo0 kjo0Var3 = i2n1Var2.b;
        String str = kjo0Var3.c;
        qmo0 qmo0Var = kjo0Var3.e;
        if (qmo0Var instanceof qmo0) {
            List<ybi1> list = qmo0Var.b;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (ybi1 ybi1Var : list) {
                String strValueOf = String.valueOf(ybi1Var.a);
                String str2 = ybi1Var.b;
                arrayList.add(new phx(8, 0L, strValueOf, str2, str2));
            }
            tfmVar = new ufm(mqo1.A(arrayList));
        } else if (qmo0Var instanceof nmo0) {
            tfmVar = new wfm(Uri.parse(((nmo0) qmo0Var).b));
        } else if (qmo0Var instanceof umo0) {
            umo0 umo0Var = (umo0) qmo0Var;
            ybi1 ybi1Var2 = umo0Var.b;
            String str3 = ybi1Var2.a;
            if (str3 == null) {
                str3 = "";
            }
            Uri uri = Uri.parse(str3);
            String str4 = ybi1Var2.b;
            tfmVar = new tfm(new wfm(uri, new hgm(str4, str4)), new wfm(Uri.parse(umo0Var.c.b)));
        } else {
            if (!u890.j(qmo0Var, rmo0.INSTANCE)) {
                eg.o();
                return null;
            }
            tfmVar = null;
        }
        igmVar = new igm(str, tfmVar, (String) null, 4);
        sba sbaVar2 = (sba) this.c;
        nt21 nt21Var = (nt21) this.b;
        le51 le51Var = new le51(kjo0Var3.g);
        h2n1Var.a = i2n1Var2;
        h2n1Var.b = kjo0Var3;
        h2n1Var.c = igmVar;
        h2n1Var.d = sbaVar2;
        h2n1Var.g = 1;
        Object objK = nt21Var.k(le51Var, h2n1Var);
        if (objK != d9nVar) {
            kjo0Var = kjo0Var3;
            obj = objK;
            sbaVar = sbaVar2;
        }
        return d9nVar;
        int i3 = i2n1Var2.a;
        h2n1Var.a = null;
        h2n1Var.b = null;
        h2n1Var.c = igmVar;
        h2n1Var.d = null;
        h2n1Var.g = 2;
        Object objA = sbaVar.a((ke51) obj, i3, kjo0Var, h2n1Var);
        if (objA != d9nVar) {
            igm igmVar4 = igmVar;
            obj2 = objA;
            igmVar2 = igmVar4;
            return new kjm(igmVar2, (List) obj2, 4);
        }
        return d9nVar;
    }
}
