package p;

import com.spotify.gander.v2.proto.UserImage;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hox0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hox0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        tsx0 usx0Var;
        String string;
        boolean z;
        nmu0 nmu0Var;
        byte b = this.a;
        byte b2 = 19;
        lnm lnmVar = b7x.a;
        String str = "";
        int i = 3;
        byte b3 = 23;
        rih1 rih1Var = rih1.a;
        lnm string2 = null;
        byte b4 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iox0 iox0Var = (iox0) obj2;
                s1g s1gVar = new s1g(new fu20(d3p1.F(iox0Var.d, iox0Var.e, (xnx0) obj), new zio0(2, (lnm) null, (byte) 21), (byte) 1), (byte) 11);
                Flowable flowable = iox0Var.c;
                vbm[] vbmVarArr = q601.a;
                return new x010(s1gVar, new kge(flowable), new lok0(i, string2, b2), (byte) 1);
            case 1:
                ContextTrack contextTrack = ((jpx0) obj).a;
                et90 et90Var = (et90) obj2;
                Flowable flowableI = (!((xu4) et90Var.c).a() || contextTrack == null) ? Flowable.I(Boolean.FALSE) : ((FlowableMap) et90Var.d).J(new n0v0(contextTrack, (byte) 8)).t(Functions.a).X(new xmu0(et90Var, contextTrack, b3));
                flowableI.getClass();
                return flowableI;
            case 2:
                m6j0 m6j0Var = (m6j0) obj;
                if (m6j0Var instanceof h6j0) {
                    usx0Var = tsx0.a;
                } else {
                    if (!(m6j0Var instanceof l6j0)) {
                        if ((m6j0Var instanceof j6j0) || (m6j0Var instanceof k6j0) || (m6j0Var instanceof i6j0)) {
                            return rih1Var;
                        }
                        eg.o();
                        return null;
                    }
                    l6j0 l6j0Var = (l6j0) m6j0Var;
                    usx0Var = new usx0(l6j0Var.a, l6j0Var.b);
                }
                ((cqx0) obj2).b.accept(usx0Var);
                return rih1Var;
            case 3:
                yzi0 yzi0Var = (a0j0) obj;
                fvx0 fvx0Var = (fvx0) obj2;
                mtx0 mtx0Var = fvx0Var.a;
                y11 y11Var = fvx0Var.e;
                if (yzi0Var.equals(wzi0.a)) {
                    y11Var.accept(yrx0.a);
                    return rih1Var;
                }
                if (yzi0Var.equals(wzi0.b)) {
                    y11Var.accept(zrx0.a);
                    return rih1Var;
                }
                if (yzi0Var instanceof zzi0) {
                    y11Var.accept(new itx0(((zzi0) yzi0Var).a));
                    return rih1Var;
                }
                if (yzi0Var instanceof yzi0) {
                    y11Var.accept(new xsx0(yzi0Var.a));
                    x6h1 x6h1VarC = mtx0Var.b.b.c();
                    x6h1VarC.i.add(new a7h1("send_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, lnmVar), new x7h1("refresh_content", 1, lnmVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return rih1Var;
                }
                if (yzi0Var instanceof vzi0) {
                    String str2 = ((vzi0) yzi0Var).a;
                    x6h1 x6h1VarC2 = mtx0Var.b.b.c();
                    x6h1VarC2.i.add(new a7h1("create_playlist_cta_button", str2, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y11Var.accept(new srx0(mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, lnmVar), new x7h1("create_playlist", 1, lnmVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                    return rih1Var;
                }
                if (!(yzi0Var instanceof xzi0)) {
                    eg.o();
                    return null;
                }
                String str3 = ((xzi0) yzi0Var).a;
                x6h1 x6h1VarC3 = mtx0Var.b.b.c();
                x6h1VarC3.i.add(new a7h1("save_options_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("save_as_new_playlist_button", str3, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y11Var.accept(new vsx0(mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, lnmVar), new x7h1("create_playlist", 1, lnmVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 4:
                bpb1 bpb1Var = ((qyx0) obj2).a;
                Boolean boolValueOf = Boolean.valueOf(new s44(true, ((vuk) obj).j()).a());
                bpb1Var.getClass();
                bpb1Var.m((Object) null, boolValueOf);
                return rih1Var;
            case 5:
                Map map = ((cxc0) obj).f.q;
                return new y0y0(ejo1.r(map), !((zb91) ((ih60) obj2).e).e(map).isEmpty());
            case 6:
                f2y0 f2y0Var = (f2y0) ((et90) obj2).d;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = f2y0Var.b;
                mr20[] mr20VarArr = {rqt0.u(new j5b0(((roc0) f2y0Var.a).d(), b2))};
                companion.getClass();
                ((a7m0) obj).b = new b(q8nVar, mr20VarArr);
                return rih1Var;
            case 7:
                return new rxc0(((j2y0) obj2).b);
            case 8:
                return new rxc0(((z2y0) obj2).b);
            case 9:
                c4y0 c4y0Var = (c4y0) ((rwj) obj2).e;
                FlowEventSources.Companion companion2 = FlowEventSources.a;
                q8n q8nVar2 = c4y0Var.b;
                mr20[] mr20VarArr2 = {rqt0.u(new x010(((roc0) c4y0Var.a).d(), c4y0Var.c, new lok0(i, string2, (byte) 20), (byte) 1))};
                companion2.getClass();
                ((a7m0) obj).b = new b(q8nVar2, mr20VarArr2);
                return rih1Var;
            case 10:
                return new rxc0(((j2y0) obj2).b);
            case 11:
                return new rxc0(((w4y0) obj2).b);
            case 12:
                return z47.w(de40.g((v5y0) obj), ((de40) obj2).b.c());
            case 13:
                return new x010((mr20) obj, ((roc0) ((koc0) ((uqg) obj2).b)).d(), new w6y0(3, null, (byte) 0), (byte) 1);
            case 14:
                kby kbyVar = ((cxc0) obj).f;
                Map map2 = kbyVar.q;
                Set set = h4d0.a;
                String str4 = (String) map2.get("generation_status");
                if (str4 != null && (string = ihc1.e1(str4).toString()) != null) {
                    str = string;
                }
                h4d0 h4d0VarU = qyo1.u(str);
                Object[] objArr = h4d0VarU.a() && ((ags0) ((ca3) obj2).d).a(kbyVar.a);
                x4i1 x4i1Var = kbyVar.e;
                return new p3y0(x4i1Var != null ? x4i1Var.a : null, h4d0VarU.b(), h4d0.a.contains(h4d0VarU) || objArr == true);
            case 15:
                return new rxc0(((t7y0) obj2).a);
            case 16:
                l7e0 l7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                zuc0 zuc0Var = j7e0Var != null ? j7e0Var.a : null;
                co01 co01Var = new co01(zuc0Var != null ? zuc0Var.b : 0, ((h82) obj2).b, l7e0Var.getUri());
                string2 = zuc0Var != null ? zuc0Var.g : null;
                if (string2 != null) {
                    lnmVar = string2;
                }
                return new ao01(co01Var, u890.j(lnmVar.get("track_source"), "PROMPT_GENERATED"));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new rxc0(((m8y0) obj2).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                cas casVar = (a7m0) obj;
                casVar.a = j8y0.g;
                casVar.d = h0x0.Z;
                casVar.e = h0x0.N0;
                casVar.a(new ewq0((int) b4, (byte) 22), new ewq0(b4, b3));
                t9y0 t9y0Var = (t9y0) obj2;
                casVar.c = new lud(t9y0Var.b, t9y0Var.c, new zio0(2, (lnm) null, (byte) 23));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                sby0 sby0Var = (sby0) obj2;
                kby kbyVar2 = ((cxc0) obj).f;
                Map map3 = kbyVar2.q;
                Object[] objArr2 = map3.containsKey("prompt") || map3.containsKey("prompt_summary");
                String str5 = (String) map3.get("owner_username");
                String string3 = str5 != null ? ihc1.e1(str5).toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                boolean z2 = kbyVar2.f && objArr2 == true && string3.length() > 0;
                boolean zJ = u890.j(map3.get("user_tracklist_changes_applied"), "true");
                boolean z3 = Boolean.parseBoolean((String) map3.get("mix")) && Boolean.parseBoolean((String) map3.get("has-custom-transitions"));
                String str6 = (String) map3.get("refresh_cadence");
                if (str6 != null) {
                    z = str6.length() > 0 && !str6.toUpperCase(Locale.ROOT).equals("NEVER");
                } else {
                    z = false;
                }
                String str7 = (String) map3.get("generation_mode");
                if (str7 == null) {
                    nmu0Var = null;
                } else if (str7.equals("MODE_ITERATIVE_UPDATE")) {
                    nmu0Var = nmu0.b;
                } else {
                    str7.equals("MODE_FULL_GENERATION");
                    nmu0Var = nmu0.c;
                }
                if (nmu0Var == null) {
                    nmu0Var = nmu0.a;
                }
                nmu0 nmu0Var2 = nmu0Var;
                String str8 = sby0Var.a;
                String str9 = (String) map3.get("owner_username");
                string2 = str9 != null ? ihc1.e1(str9).toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                boolean z4 = string2.length() > 0 && string2.equals(str8);
                String str10 = (String) map3.get("error_list");
                return new gek1(z4, z2, str10 == null ? "" : str10, zJ, z3, sby0Var.b.c(), z, nmu0Var2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vga0 vga0Var = (vga0) obj;
                UserImage userImage = (UserImage) obj2;
                j9k1.A(vga0Var, "image_url", userImage.getImageUrl());
                j9k1.A(vga0Var, "user_display_name", userImage.o());
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((Completable) ((x631) ((nqy0) obj2).a.c).invoke("android-puffin-onboarding")).d(Observable.just(tqy0.a)).onErrorReturn(r5x0.c);
            case 22:
                return ((Completable) ((x631) ((lry0) obj2).a.c).invoke("android-puffin-onboarding")).d(Observable.just(qry0.a)).onErrorReturn(l9x0.c);
            case 23:
                return new xry0(((zry0) obj2).b.a);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new gty0(((ity0) obj2).c.a);
            case 25:
                ((qtr) obj).b(new k8y0((v1z0) obj2, string2, b4));
                return rih1Var;
            case 26:
                ((qv00) obj).b(ro7.class, ((b5z0) obj2).d, false);
                return rih1Var;
            case 27:
                rwq0.z((qtr) obj, new ixt0((q9z0) obj2, (byte) 24));
                return rih1Var;
            case 28:
                ((qtr) obj).b(new eri0((nl9) obj2, (lnm) null, (byte) 9));
                return rih1Var;
            default:
                waz0 waz0Var = (waz0) obj2;
                return new mpy0(rqt0.u(waz0Var.e()), waz0Var, (Set) obj, b4);
        }
    }
}
