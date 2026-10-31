package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pr90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr90(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        int iP;
        float f;
        byte b = this.a;
        bdc1 bdc1Var = bdc1.a;
        rih1 rih1Var = rih1.a;
        hzx hzxVarA = null;
        int size = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                qr90 qr90Var = (qr90) obj;
                return p7h.M(new yt90[]{qr90Var.a.get(), qr90Var.b.get(), qr90Var.c.get(), qr90Var.d.get(), qr90Var.e.get(), qr90Var.f.get(), qr90Var.g.get(), qr90Var.h.get(), qr90Var.i.get()});
            case 1:
                ((a1r0) ((cs90) obj).d.get()).l();
                return rih1Var;
            case 2:
                st60 st60Var = ((rx90) obj).i;
                Resources resources = (Resources) st60Var.d;
                c9c0 c9c0Var = (c9c0) st60Var.b;
                if (((no4) ((b0a0) st60Var.c).a.get()).v()) {
                    pp90 pp90Var = (pp90) c9c0Var.b.current().getValue();
                    lw90 lw90VarT = pp90Var != null ? bwp0.t(pp90Var, (ap90) c9c0Var.d.b().getValue()) : null;
                    if (!(lw90VarT instanceof iw90) || ((iw90) lw90VarT).e == null) {
                        if (lw90VarT != null) {
                            int size2 = lw90VarT.c().b.size() + (lw90VarT.d() ? 1 : 0);
                            cw90 cw90VarB = lw90VarT.b();
                            size = (cw90VarB != null ? cw90VarB.b.size() : 0) + size2;
                        }
                        iP = yoi1.p((int) (((size * 62.0f) + 140.0f + ((lw90VarT != null ? lw90VarT.b() : null) != null ? 40.0f : 0.0f) + 80.0f) * resources.getDisplayMetrics().density), (int) (resources.getDisplayMetrics().heightPixels * 0.4f), (int) (resources.getDisplayMetrics().heightPixels * 0.75f));
                    } else {
                        f = resources.getDisplayMetrics().heightPixels * 0.75f;
                    }
                    return Integer.valueOf(iP);
                }
                f = resources.getDisplayMetrics().heightPixels * 0.66f;
                iP = (int) f;
                return Integer.valueOf(iP);
            case 3:
                ((a1r0) ((cs90) obj).d.get()).l();
                return rih1Var;
            case 4:
                xok0 xok0Var = ((xz90) obj).N0;
                xok0Var.getClass();
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 5:
                return f6o1.A((br0) obj, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 6:
                return (s3a0) ((r3a0) obj).a.get();
            case 7:
                return (j4a0) ((i4a0) obj).a.get();
            case 8:
                lzn0 lzn0Var = (lzn0) ((xzp) ((z2p) ((wkp) obj).a.b).b).a.i.get();
                c8o.l(lzn0Var);
                return new kpg0(new na9(lzn0Var, (byte) 8), mr90.S0);
            case 9:
                qjp qjpVar = (qjp) ((xkp) ((ka3) obj).d).a.b;
                d0r d0rVar = ((tbt) qjpVar.b).a;
                Context context = (Context) ((a0q) qjpVar.c).a.x1.a;
                c8o.l(context);
                return new xzq(new ujo(d0rVar, context), mr90.T0);
            case 10:
                return new cx0((l1b) obj, (byte) 0);
            case 11:
                return new xzq(new xnb(((gl90) ((b6p) ((ykp) ((lna0) obj).d).a.b).b).b, (byte) 2), mr90.Z0);
            case 12:
                return ((nna0) obj).a.getString(2131960630);
            case 13:
                return ((yna0) obj).a.getString(2131960630);
            case 14:
                wza0 wza0Var = (wza0) obj;
                try {
                    return wza0Var.a();
                } catch (Exception e) {
                    wza0.d("Account Graduation preferences could not be created first time", e);
                    if (e instanceof KeyStoreException) {
                        try {
                            Context context2 = wza0Var.a;
                            try {
                                context2.getSharedPreferences("genalpha_account_graduation_encrypted_sharedprefs", 0).edit().clear().apply();
                                context2.deleteSharedPreferences("genalpha_account_graduation_encrypted_sharedprefs");
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                keyStore.deleteEntry("_androidx_security_master_key_");
                            } catch (Exception e2) {
                                wza0.d("Account Graduation failed to delete shared preferences file", e2);
                            }
                            hzxVarA = wza0Var.a();
                        } catch (Exception e3) {
                            wza0.d("Account Graduation could not recreate shared preferences", e3);
                        }
                        break;
                    }
                    return hzxVarA;
                }
            case 15:
                return new q0b0((nfa0) obj);
            case 16:
                at7 at7Var = (at7) obj;
                return sqg0.J(new mmr0[]{new mmr0("rose", Integer.valueOf(at7Var.d(2131101585))), new mmr0("salmon", Integer.valueOf(at7Var.d(2131101586))), new mmr0("violet", Integer.valueOf(at7Var.d(2131101588))), new mmr0("lavender", Integer.valueOf(at7Var.d(2131101583))), new mmr0("azure", Integer.valueOf(at7Var.d(2131101578))), new mmr0("aquamarine", Integer.valueOf(at7Var.d(2131101577))), new mmr0("powder green", Integer.valueOf(at7Var.d(2131101584))), new mmr0("electric seafoam", Integer.valueOf(at7Var.d(2131101580))), new mmr0("tangerine", Integer.valueOf(at7Var.d(2131101587))), new mmr0("gold", Integer.valueOf(at7Var.d(2131101582))), new mmr0("factory yellow", Integer.valueOf(at7Var.d(2131101581))), new mmr0("citric", Integer.valueOf(at7Var.d(2131101579)))});
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                nm1 nm1Var = (nm1) obj;
                return new v4b0((d0r) nm1Var.b, (gw70) nm1Var.f, (lzn0) nm1Var.g);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((lvc0) obj).a(bdc1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((kxc0) obj).a(bdc1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((uxc0) obj).a();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((tbb0) obj).d.finish();
                return rih1Var;
            case 22:
                return new dgb0(((egb0) obj).d.getResources());
            case 23:
                try {
                    List<t081> listK = w081.k(((ogb0) obj).a, 4);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (t081 t081Var : listK) {
                        t081Var.getClass();
                        Integer numC0 = nhc1.c0(ihc1.H0(t081Var.b, "customshortcut-lastvisitedpage-"));
                        if (numC0 != null) {
                            linkedHashSet.add(numC0);
                        }
                    }
                    return linkedHashSet;
                } catch (IllegalArgumentException e4) {
                    n57.g("Could not retrieve pinned shortcuts", e4);
                    return null;
                }
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((ttm0) ((nib0) obj).b.get()).c(true);
            case 25:
                return new err0(((yjd1) obj).d);
            case 26:
                return (cob0) obj;
            case 27:
                return ((pob0) obj).b();
            case 28:
                tvb0 tvb0Var = (tvb0) obj;
                j380 j380Var = tvb0Var.e;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(j380Var.size()));
                for (Map.Entry entry : j380Var.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((mtm1) entry.getValue()).b(new ft30(1, tvb0Var, tvb0.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, (byte) 26)));
                }
                return linkedHashMap;
            default:
                return ((m1q) ((rwj) obj).d).a(new uxb0(2, false));
        }
    }
}
