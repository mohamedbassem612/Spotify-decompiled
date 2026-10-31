package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bom1 extends hab0 implements vu30 {
    public static final bom1 b;
    public static final bom1 c;
    public static final bom1 d;
    public static final bom1 e;
    public static final bom1 f;
    public static final bom1 g;
    public static final bom1 h;
    public static final bom1 i;
    public static final bom1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new bom1(i2, (byte) 0);
        c = new bom1(i2, (byte) 1);
        d = new bom1(i2, (byte) 2);
        e = new bom1(i2, (byte) 3);
        f = new bom1(i2, (byte) 4);
        g = new bom1(i2, (byte) 5);
        h = new bom1(i2, (byte) 6);
        i = new bom1(i2, (byte) 7);
        t = new bom1(i2, (byte) 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bom1(byte b2, int i2, boolean z) {
        super(2);
        this.a = b2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:89:0x0257  */
    public final Object invoke(Object obj, Object obj2) {
        goj0 goj0VarA;
        hzy hzyVar;
        mq70 mq70Var;
        up70 up70VarA;
        goj0 goj0VarA2;
        zoy0 zoy0Var;
        fa3 ea3Var;
        SimpleDateFormat simpleDateFormat;
        Date date;
        List list;
        goj0 goj0VarA3;
        byte b2 = this.a;
        ebw ebwVar = ebw.a;
        b7x b7xVar = b7x.a;
        int i2 = 0;
        zContains = false;
        boolean zContains = false;
        i2 = 0;
        i2 = 0;
        ez00 ez00Var = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Next.i(znm1.a, Collections.singleton(ebwVar));
            case 1:
                return First.c((aom1) obj2, Collections.singleton(ebwVar));
            case 2:
                return (qom1) obj2;
            case 3:
                return Boolean.valueOf(((iqm1) obj).a.equals(((iqm1) obj2).a));
            case 4:
                return Boolean.valueOf(((String) obj).equals((String) obj2));
            case 5:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), ((tzl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 6:
                return (hzm1) obj;
            case 7:
                return (nb81) obj;
            case 8:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), ((nzl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 9:
                String str = (String) obj;
                hoj0 hoj0VarC = ((ioj0) obj2).c(hzy.class, str);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (hzyVar = (hzy) goj0VarA.a) != null) {
                    i2 = hzyVar.a;
                }
                return new q20(str, i2 != 0 ? i2 : 1);
            case 10:
                iam iamVar = (iam) obj2;
                return new qh1((vnb1) obj, (iamVar != null ? iamVar.a : 0) == 6);
            case 11:
                ((Number) obj2).intValue();
                g9p1.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                s9p1.x((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                pw2 pw2Var = (pw2) obj;
                String str2 = pw2Var.a;
                String str3 = pw2Var.b;
                String str4 = pw2Var.c;
                xkk1 xkk1Var = ((cw2) obj2).a;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.b)) != null) {
                    ez00Var = up70VarA.a.a;
                }
                return new rw2(str2, str3, str4, ez00Var, pw2Var.d);
            case 14:
                hoj0 hoj0VarC2 = ((ioj0) obj2).c(zoy0.class, ((b83) obj).a);
                return nhc1.W(nhc1.W(o7h.y0((Iterable) ((hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null || (zoy0Var = (zoy0) goj0VarA2.a) == null) ? z6x.a : zoy0Var.a), System.lineSeparator(), (String) null, (String) null, (iu30) null, 62), "(P)", "℗"), "(C)", "©");
            case 15:
                ha3 ha3Var = (ha3) obj;
                ga3 ga3Var = (ga3) obj2;
                String str5 = ha3Var.b;
                if (str5 != null) {
                    switch (str5) {
                        case "SINGLE":
                            ea3Var = new da3(2131952199);
                            break;
                        case "AUDIOBOOK":
                            ea3Var = new da3(2131952195);
                            break;
                        case "EP":
                            ea3Var = new da3(2131952197);
                            break;
                        case "ALBUM":
                            ea3Var = new da3(2131952194);
                            break;
                        case "COMPILATION":
                            ea3Var = new da3(2131952196);
                            break;
                        default:
                            ea3Var = new ea3(str5);
                            break;
                    }
                } else {
                    ea3Var = null;
                }
                String str6 = ha3Var.c;
                if (str6 != null && (date = (simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault())).parse(str6)) != null) {
                    ez00Var = simpleDateFormat.format(date);
                }
                return new ia3(ea3Var, ez00Var, ga3Var.a);
            case 16:
                ((Number) obj2).intValue();
                rqg0.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                lmt0.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                bqn1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                b3o1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return u16.f((k1r) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                dl6 dl6Var = (dl6) obj;
                al6 al6Var = (al6) obj2;
                zzq0 zzq0Var = dl6Var.c;
                cl6 cl6Var = dl6Var.b;
                long j = al6Var.b;
                c9 c9Var = al6Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(c9Var, 10));
                ListIterator listIterator = c9Var.listIterator(0);
                while (listIterator.hasNext()) {
                    ayg aygVar = (ayg) listIterator.next();
                    arrayList.add(new ayg(aygVar.c, aygVar.d, dl6Var.a));
                }
                return new el6(mqo1.F(arrayList), j, cl6Var, zzq0Var);
            case 22:
                i1r i1rVar = (k1r) obj;
                qxc0 qxc0Var = (qxc0) obj2;
                String str7 = qxc0Var != null ? (String) qxc0Var.X.get("collabs_playlist_uri") : null;
                if (i1rVar instanceof h1r) {
                    return km6.a;
                }
                if (!(i1rVar instanceof i1r)) {
                    if (i1rVar.equals(j1r.a)) {
                        return mm6.a;
                    }
                    eg.o();
                    return null;
                }
                Iterable iterable = (Iterable) i1rVar.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pvc0) it.next()).c);
                }
                return new lm6(str7, mqo1.F(arrayList2));
            case 23:
                ((Number) obj2).intValue();
                zm6.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ep6.f((bp6) obj, (k1r) obj2);
            case 25:
                ((Number) obj2).intValue();
                nko1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                cy6 cy6Var = (cy6) obj;
                String str8 = cy6Var.a;
                hoj0 hoj0VarC3 = ((ioj0) obj2).c(hll.class, str8);
                if (hoj0VarC3 != null && (goj0VarA3 = hoj0VarC3.a()) != null) {
                    ez00Var = (ez00) goj0VarA3.a;
                }
                hll hllVar = (hll) ez00Var;
                if (hllVar != null && (list = hllVar.b) != null) {
                    zContains = list.contains(ell.b);
                }
                return new dy6(str8, cy6Var.b, zContains);
            case 27:
                ((Number) obj2).intValue();
                m1p1.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                mmr0 mmr0Var = (mmr0) obj2;
                PlayerState playerState = (PlayerState) mmr0Var.a;
                Boolean bool = (Boolean) mmr0Var.b;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                String strUri = contextTrack.uri();
                boolean z = Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_ban"));
                boolean z2 = Boolean.parseBoolean((String) contextTrack.metadata().get("collection.is_banned"));
                String strProvider = contextTrack.provider();
                String strContextUri = playerState.contextUri();
                if (strContextUri == null) {
                    strContextUri = "";
                }
                return new t3a(strUri, strContextUri, strProvider, z, z2, bool.booleanValue());
            default:
                ((Number) obj2).intValue();
                p6p1.b((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bom1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bom1(avl1 avl1Var, byte b2) {
        super(2);
        this.a = b2;
    }
}
