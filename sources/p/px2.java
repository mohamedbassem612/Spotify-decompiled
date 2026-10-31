package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class px2 {
    public final List a;
    public final bpb1 b;
    public final bpb1 c;
    public final x010 d;

    public px2(List list, Locale locale) {
        this.a = list;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.b = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(locale);
        this.c = bpb1VarB2;
        this.d = new x010(bpb1VarB, bpb1VarB2, new xq0(3, this, px2.class, "snapshotOf", "snapshotOf(Ljava/lang/String;Ljava/util/Locale;)Lcom/spotify/martini/voicechatcharacterpage/AgentVoiceSelectionState$Snapshot;", 4, (byte) 1), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:44:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:2: B:20:0x0048->B:45:?, LOOP_END, SYNTHETIC] */
    public final ox2 a(String str, Locale locale) {
        kx2 kx2Var;
        Object obj = null;
        List list = this.a;
        if (str == null) {
            kx2 kx2Var2 = (kx2) o7h.s0(list);
            str = kx2Var2 != null ? kx2Var2.a : null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kx2) it.next()).d);
        }
        List listJ0 = o7h.j0(arrayList);
        if (locale == null) {
            for (Object obj2 : list2) {
                if (((kx2) obj2).a.equals(str)) {
                    obj = obj2;
                    break;
                }
            }
            kx2Var = (kx2) obj;
            if (kx2Var != null) {
                locale = kx2Var.d;
            } else {
                locale = (Locale) o7h.s0(listJ0);
            }
        } else {
            if (!listJ0.contains(locale)) {
                locale = null;
            }
            if (locale == null) {
                while (r6.hasNext()) {
                    if (((kx2) obj2).a.equals(str)) {
                        obj = obj2;
                        break;
                    }
                }
                kx2Var = (kx2) obj;
                if (kx2Var != null) {
                    locale = kx2Var.d;
                } else {
                    locale = (Locale) o7h.s0(listJ0);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((kx2) obj3).d.equals(locale)) {
                arrayList2.add(obj3);
            }
        }
        return new ox2(listJ0, locale, arrayList2, str);
    }
}
