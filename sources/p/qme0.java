package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class qme0 implements Update {
    public static final qme0 a = new qme0();

    public final Next a(Object obj, Object obj2) {
        ume0 ume0Var = (ume0) obj;
        gme0 gme0Var = (gme0) obj2;
        String str = ume0Var.c;
        String str2 = ume0Var.a;
        if (gme0Var instanceof eme0) {
            String str3 = ((eme0) gme0Var).a;
            return str3.length() == 0 ? Next.h(ume0.a(ume0Var, (String) null, (nhe0) null, str3, z6x.a, 1, (List) null, 35)) : Next.i(ume0.a(ume0Var, (String) null, (nhe0) null, str3, (List) null, 2, (List) null, 43), Collections.singleton(new ake0(str3)));
        }
        if (gme0Var instanceof ule0) {
            nhe0 nhe0Var = ((ule0) gme0Var).a;
            return Next.a(f46.S0(new d9p1[]{new bke0(nhe0Var, str2), new zje0(nhe0Var), new yje0(nhe0Var)}));
        }
        if (gme0Var instanceof ame0) {
            nhe0 nhe0Var2 = ((ame0) gme0Var).a;
            return Next.a(f46.S0(new d9p1[]{new bke0(nhe0Var2, str2), new zje0(nhe0Var2), new yje0(nhe0Var2)}));
        }
        if (gme0Var instanceof ple0) {
            nhe0 nhe0Var3 = ume0Var.b;
            return nhe0Var3 == null ? Next.j() : Next.a(f46.S0(new d9p1[]{new bke0(nhe0Var3, str2), mje0.c}));
        }
        if (gme0Var instanceof lle0) {
            return Next.a(Collections.singleton(uje0.c));
        }
        if (gme0Var instanceof fme0) {
            fme0 fme0Var = (fme0) gme0Var;
            ArrayList arrayList = fme0Var.b;
            if (u890.j(fme0Var.a, str)) {
                return Next.h(ume0.a(ume0Var, (String) null, (nhe0) null, (String) null, arrayList, arrayList.isEmpty() ? 4 : 3, (List) null, 39));
            }
            return Next.j();
        }
        if (gme0Var instanceof dme0) {
            return !u890.j(((dme0) gme0Var).a, str) ? Next.j() : Next.h(ume0.a(ume0Var, (String) null, (nhe0) null, (String) null, (List) null, 5, (List) null, 47));
        }
        if (!(gme0Var instanceof cme0)) {
            if (gme0Var instanceof ole0) {
                return Next.h(ume0.a(ume0Var, (String) null, ((ole0) gme0Var).a, (String) null, (List) null, 0, (List) null, 61));
            }
            eg.o();
            return null;
        }
        List list = ume0Var.f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (!u890.j((nhe0) obj3, ((cme0) gme0Var).a)) {
                arrayList2.add(obj3);
            }
        }
        return Next.i(ume0.a(ume0Var, (String) null, (nhe0) null, (String) null, (List) null, 0, arrayList2, 31), Collections.singleton(new oje0(((cme0) gme0Var).a)));
    }
}
