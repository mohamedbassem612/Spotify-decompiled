package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class xq0 extends k01 implements xu30 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(u4q0 u4q0Var) {
        super(3, u4q0Var, u4q0.class, "miniTrialManualOptInEligibility", "miniTrialManualOptInEligibility(Lcom/spotify/ondemandtrials/config/storage/TrialEligibility;Z)Lcom/spotify/ondemandtrials/config/ManualOptInEligibility;", 4);
        this.h = (byte) 7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Long l;
        byte b = this.h;
        Object obj4 = ((k01) this).a;
        switch (b) {
            case 0:
                v6l v6lVar = (e7l) obj;
                t62 t62Var = (t62) obj2;
                ((yq0) obj4).getClass();
                if (v6lVar instanceof v6l) {
                    ContextTrack contextTrack = v6lVar.a;
                    return new wq0(f3o1.f(contextTrack, (ji0) null), null, t62Var.a, t62Var.b, p2o1.q(contextTrack));
                }
                if (!(v6lVar instanceof z6l)) {
                    eg.o();
                    return null;
                }
                z6l z6lVar = (z6l) v6lVar;
                ContextTrack contextTrack2 = z6lVar.a;
                ji0 ji0Var = z6lVar.b;
                return new wq0(f3o1.f(contextTrack2, ji0Var), ji0Var.U0, t62Var.a, t62Var.b, p2o1.r(ji0Var));
            case 1:
                return ((px2) obj4).a((String) obj, (Locale) obj2);
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((wc8) obj4).getClass();
                HashSet hashSet = new HashSet();
                ArrayList<pvc0> arrayList = new ArrayList();
                for (Object obj5 : (List) obj) {
                    if (hashSet.add(((pvc0) obj5).c)) {
                        arrayList.add(obj5);
                    }
                }
                if (arrayList.isEmpty()) {
                    return z6x.a;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pvc0) it.next()).c);
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                for (pvc0 pvc0Var : arrayList) {
                    String str = pvc0Var.a;
                    if (str.length() == 0) {
                        str = pvc0Var.c;
                    }
                    arrayList3.add(str);
                }
                int i = 0;
                boolean z = arrayList2.size() > 3;
                List listD1 = (zBooleanValue || !z) ? arrayList2 : o7h.d1(arrayList2, 2);
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new h8k1(t761.a, "series-heading"));
                for (Object obj6 : listD1) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    smc0VarN.add(new h8k1(new u761((String) obj6, i), gvg.g(arrayList3.get(i), "series-")));
                    i = i2;
                }
                if (z) {
                    smc0VarN.add(new h8k1(new s761(zBooleanValue ? null : (String) o7h.t0(2, arrayList2), listD1.size(), zBooleanValue), "series-footer"));
                }
                return k4p1.k(smc0VarN);
            case 3:
                ((p1l) obj4).getClass();
                return Boolean.valueOf(p1l.f((ea6) obj, (n1l) obj2));
            case 4:
                return ((zns) obj4).a((gz51) obj, (Map) obj2);
            case 5:
                Map map = (Map) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                hny hnyVar = (hny) obj4;
                hnyVar.getClass();
                h380 h380VarA = j380.a();
                h380VarA.e("locale", hnyVar.c);
                h380VarA.e("application", "nft");
                h380VarA.e("platform", "android");
                h380VarA.e("video", String.valueOf(y7y0.t("shows-collection-jam", map)));
                h380VarA.e("podcast", String.valueOf(y7y0.t("has-podcasts-available", map)));
                h380VarA.e("checkDeviceCapability", String.valueOf(y7y0.L(map)));
                if ("active".equals(map.get("on-demand-trial"))) {
                    h380VarA.e("on-demand-trial", "true");
                }
                if (zBooleanValue2) {
                    h380VarA.e("trackRows", "true");
                }
                if (xoi1.b(hnyVar.d.a)) {
                    h380VarA.e("signal", "device_type:tablet");
                }
                return h380VarA.b(true);
            case 6:
                h3e0 h3e0Var = (j3e0) obj;
                PlayerState playerState = (PlayerState) obj2;
                m3e0 m3e0Var = (m3e0) obj4;
                m3e0Var.getClass();
                ContextTrack contextTrack3 = (ContextTrack) playerState.track().h();
                String strUri = contextTrack3 != null ? contextTrack3.uri() : null;
                if (strUri == null) {
                    strUri = "";
                }
                String str2 = (String) playerState.playbackId().h();
                String str3 = str2 != null ? str2 : "";
                if ((h3e0Var instanceof h3e0) && contextTrack3 != null && contextTrack3.metadata().isEmpty()) {
                    h3e0 h3e0Var2 = h3e0Var;
                    if (h3e0Var2.a.equals(strUri) && h3e0Var2.b.equals(str3)) {
                        return h3e0Var;
                    }
                }
                return (contextTrack3 == null || !m3e0Var.a.a(contextTrack3) || str3.length() <= 0 || strUri.length() <= 0) ? i3e0.a : new h3e0(strUri, str3);
            default:
                nrg1 nrg1Var = (nrg1) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                u4q0 u4q0Var = (u4q0) obj4;
                u4q0Var.getClass();
                if (!nrg1Var.a || !nrg1Var.d || (l = nrg1Var.b) == null || l.longValue() <= u4q0Var.c.b() / 1000 || zBooleanValue3) {
                    return sig0.a;
                }
                Integer num = nrg1Var.c;
                return new rig0(num != null ? num.intValue() : 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xq0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }
}
