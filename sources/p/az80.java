package p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.media3.exoplayer.ExoPlayer;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.repository.MobileReportWorker;
import com.ravelin.core.repository.RavelinWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.listplatform.sortingimpl.ListSortingProto$ListSortingStore;
import com.spotify.listplatform.sortingimpl.ListSortingProto$UserSortOrders;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class az80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az80(Function0 function0, kpe0 kpe0Var, dwn0 dwn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.d = function0;
        this.c = kpe0Var;
        this.b = dwn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new az80((ly80) this.c, (Function0) obj2, (iu30) obj3, lnmVar, (byte) 0);
            case 1:
                return new az80((r390) this.c, (iu30) obj3, (ExoPlayer) obj2, false, lnmVar, (byte) 1);
            case 2:
                return new az80((cn30) this.c, (String) obj2, (bq90) obj3, lnmVar, (byte) 2);
            case 3:
                return new az80((iu30) obj3, (bcb0) this.c, (acb0) obj2, lnmVar);
            case 4:
                return new az80((List) this.c, (pbr0) obj2, (yqg) obj3, lnmVar, (byte) 4);
            case 5:
                return new az80((tvb0) this.c, (i4d0) obj2, (tob1) obj3, lnmVar, (byte) 5);
            case 6:
                return new az80((jyb0) this.c, (String) obj2, (String) obj3, lnmVar, (byte) 6);
            case 7:
                az80 az80Var = new az80(obj2, obj3, lnmVar, (byte) 7);
                az80Var.c = obj;
                return az80Var;
            case 8:
                return new az80((zdc0) this.c, (String) obj2, (tv80) obj3, lnmVar, (byte) 8);
            case 9:
                az80 az80Var2 = new az80(obj2, obj3, lnmVar, (byte) 9);
                az80Var2.c = obj;
                return az80Var2;
            case 10:
                az80 az80Var3 = new az80(obj2, obj3, lnmVar, (byte) 10);
                az80Var3.c = obj;
                return az80Var3;
            case 11:
                return new az80((see0) this.c, (Context) obj2, (iu30) obj3, lnmVar, (byte) 11);
            case 12:
                return new az80((Function0) obj2, (kpe0) this.c, (dwn0) obj3, lnmVar);
            case 13:
                az80 az80Var4 = new az80(obj2, obj3, lnmVar, (byte) 13);
                az80Var4.c = obj;
                return az80Var4;
            case 14:
                return new az80((jzf0) this.c, (m0g0) obj2, (l7p0) obj3, lnmVar, (byte) 14);
            case 15:
                return new az80((y2g0) this.c, (String) obj3, (Function0) obj2, false, lnmVar, (byte) 15);
            case 16:
                return new az80((fwg0) this.c, (gw70) obj2, (ven0) obj3, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new az80((a6h0) this.c, (iu30) obj3, (f6h0) obj2, false, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new az80((lz20) this.c, (k6a1) obj3, (Function0) obj2, false, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new az80((fth0) this.c, (zsh0) obj2, (String) obj3, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new az80((String) this.c, (yge0) obj2, (ParcelFileDescriptor) obj3, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new az80((o091) this.c, (u5i0) obj2, (iu30) obj3, lnmVar, (byte) 21);
            case 22:
                return new az80((k8i0) this.c, (tob1) obj2, (ven0) obj3, lnmVar, (byte) 22);
            case 23:
                az80 az80Var5 = new az80(obj2, obj3, lnmVar, (byte) 23);
                az80Var5.c = obj;
                return az80Var5;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new az80((spj0) this.c, this.d, (p811) obj3, lnmVar, (byte) 24);
            case 25:
                return new az80((tv80) this.c, (buj0) obj2, (String) obj3, lnmVar, (byte) 25);
            case 26:
                return new az80((avj0) this.c, (qmn) obj2, (tv80) obj3, lnmVar, (byte) 26);
            case 27:
                return new az80((MobileReportWorker) this.c, (String) obj2, (MobileReportRequest) obj3, lnmVar, (byte) 27);
            case 28:
                return new az80((mrm0) this.c, (wrm0) obj2, (ven0) obj3, lnmVar, (byte) 28);
            default:
                az80 az80Var6 = new az80(obj2, obj3, lnmVar, (byte) 29);
                az80Var6.c = obj;
                return az80Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                return create((bn70) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return create((ListSortingProto$ListSortingStore) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((ioj0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0624  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b5 A[Catch: all -> 0x0192, TryCatch #2 {all -> 0x0192, blocks: (B:43:0x0140, B:45:0x014a, B:50:0x0159, B:52:0x0161, B:63:0x018e, B:79:0x01be, B:69:0x0196, B:70:0x0199, B:72:0x019c, B:75:0x01a5, B:77:0x01ab, B:78:0x01b5, B:67:0x0194, B:54:0x0174, B:56:0x017a, B:59:0x0186), top: B:320:0x0140, inners: #4, #9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws IOException {
        hoj0 hoj0Var;
        goj0 goj0VarA;
        hoj0 hoj0Var2;
        Long m231Var;
        long length;
        byte b = 4;
        boolean z = true;
        boolean z2 = true;
        byte b2 = 0;
        b2 = 0;
        b2 = 0;
        b2 = 0;
        n6r0 n6r0Var = null;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                if (((ly80) this.c).o) {
                    ((Function0) this.d).invoke();
                    ((iu30) this.b).invoke(gy80.a);
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                if (((r390) this.c).Y) {
                    return null;
                }
                return ((iu30) this.b).invoke((ExoPlayer) this.d);
            case 2:
                hm5.M(obj);
                ser serVar = ((cn30) this.c).b;
                String str = (String) this.d;
                String str2 = nik1.A5.a;
                bq90 bq90Var = (bq90) this.b;
                Bundle bundle = new Bundle();
                bundle.putParcelable("jam.ads.disclaimer.sheet.args", bq90Var);
                serVar.a(str, str2, bundle);
                return rih1.a;
            case 3:
                hm5.M(obj);
                iu30 iu30Var = (iu30) this.b;
                acb0 acb0Var = (acb0) this.d;
                iu30Var.invoke(new bcb0(acb0Var.a, acb0Var.c, acb0Var.b, acb0Var.d));
                return rih1.a;
            case 4:
                hm5.M(obj);
                List list = (List) this.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String string = ((Uri) it.next()).toString();
                    arrayList.add(new a2f(1, 3, 0L, string, string));
                }
                ((pbr0) this.d).accept(new b2f(((yqg) this.b).b() / 1000, arrayList));
                return rih1.a;
            case 5:
                hm5.M(obj);
                hzs hzsVar = ((tvb0) this.c).c;
                i4d0 i4d0Var = (i4d0) this.d;
                pkk1 pkk1Var = (pkk1) ((tob1) this.b).getValue();
                if (hzsVar.f != -1 && (!u890.j(hzsVar.h, pkk1Var) || !u890.j(hzsVar.i, i4d0Var))) {
                    int i = pkk1Var.b;
                    int i2 = pkk1Var.a;
                    if (i == -1 || i2 == -1) {
                        hzsVar.h = pkk1Var;
                        hzsVar.i = i4d0Var;
                    } else {
                        tr80 tr80Var = new tr80(i, i2, 1);
                        int i3 = i4d0Var.a;
                        int i4 = (i4d0Var.c + i3) - 1;
                        int iMax = Math.max(i, i3);
                        int iMin = Math.min(((rr80) tr80Var).b, i4);
                        tr80 tr80Var2 = iMax > iMin ? tr80.d : new tr80(iMax - i3, iMin - i3, 1);
                        if (!u890.j(hzsVar.t, tr80Var2)) {
                            hzsVar.c.onNext(new gtc0(tr80Var2));
                            hzsVar.t = tr80Var2;
                        }
                        if (!u890.j(hzsVar.e, hzsVar.d) || hzsVar.e.isEmpty()) {
                            int i5 = pkk1Var.c;
                            if (pkk1Var.d && !hzsVar.e.isEmpty() && (hzsVar.e.c(((rr80) tr80Var2).a) || hzsVar.e.c(((rr80) tr80Var2).b))) {
                                b2 = 2147483647;
                            } else {
                                tr80 tr80Var3 = hzsVar.e;
                                if (i5 == 1) {
                                    if (!tr80Var3.isEmpty() && hzsVar.e.c(((rr80) tr80Var2).b)) {
                                        int i6 = ((rr80) hzsVar.e).b;
                                        if (i6 == ((rr80) hzsVar.d).b) {
                                            b2 = 2147483647;
                                        } else {
                                            b2 = i6 - ((rr80) tr80Var2).b;
                                        }
                                    }
                                } else if (!tr80Var3.isEmpty() && hzsVar.e.c(((rr80) tr80Var2).a)) {
                                    int i7 = ((rr80) hzsVar.e).a;
                                    if (i7 == ((rr80) hzsVar.d).a) {
                                        b2 = 2147483647;
                                    } else {
                                        b2 = ((rr80) tr80Var2).a - i7;
                                    }
                                }
                            }
                            if (b2 < hzsVar.g) {
                                hzsVar.b.onNext(new dtc0(tr80Var2));
                            }
                            hzsVar.h = pkk1Var;
                            hzsVar.i = i4d0Var;
                        } else {
                            hzsVar.h = pkk1Var;
                            hzsVar.i = i4d0Var;
                        }
                    }
                }
                return rih1.a;
            case 6:
                hm5.M(obj);
                jyb0 jyb0Var = (jyb0) this.c;
                ic9 ic9Var = jyb0Var.g;
                ic9Var.q(((Context) ic9Var.b).getString(2131958547), new dt90(jyb0Var, (String) this.d, (String) this.b, b));
                return rih1.a;
            case 7:
                bn70 bn70Var = (bn70) this.c;
                hm5.M(obj);
                v6c0 v6c0Var = (v6c0) this.d;
                n6r0Var = bn70Var != null ? bn70Var.a : null;
                String str3 = (String) this.b;
                if (o7h.i0(q6r0.a, n6r0Var)) {
                    v6c0Var.b.b(str3, DismissReason.ProgrammaticDismissal.INSTANCE);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                hm5.M(obj);
                ((zdc0) this.c).d.a((String) this.d, (tv80) this.b, (Bundle) null);
                return rih1.a;
            case 9:
                String str4 = (String) this.b;
                ListSortingProto$ListSortingStore listSortingProto$ListSortingStore = (ListSortingProto$ListSortingStore) this.c;
                hm5.M(obj);
                Map mapO = listSortingProto$ListSortingStore.o();
                r3d0 r3d0Var = (r3d0) this.d;
                ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) mapO.get(r3d0Var.a);
                if (listSortingProto$UserSortOrders == null) {
                    return listSortingProto$ListSortingStore;
                }
                t3d0 t3d0Var = (t3d0) listSortingProto$ListSortingStore.toBuilder();
                String str5 = r3d0Var.a;
                w3d0 w3d0Var = (w3d0) listSortingProto$UserSortOrders.toBuilder();
                w3d0Var.s(str4);
                w3d0Var.r(str4);
                t3d0Var.n((ListSortingProto$UserSortOrders) w3d0Var.build(), str5);
                return t3d0Var.build();
            case 10:
                ioj0 ioj0VarA = (ioj0) this.c;
                hm5.M(obj);
                lpd0 lpd0Var = (lpd0) this.d;
                kdn0 kdn0Var = lpd0Var.d;
                ioj0 ioj0Var = (ioj0) kdn0Var.e();
                if (ioj0Var != null) {
                    ioj0VarA = ioj0Var.a(ioj0VarA.a, false);
                }
                kdn0Var.m(ioj0VarA);
                h290 h290Var = (h290) this.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : h290Var) {
                    String str6 = (String) obj2;
                    Map map = (Map) ioj0VarA.a.get(str6);
                    boolean z3 = ((map == null || (hoj0Var2 = (hoj0) map.get(nbw0.class)) == null) ? null : hoj0Var2.a()) != null;
                    Map map2 = (Map) ioj0VarA.a.get(str6);
                    Object obj3 = (map2 == null || (hoj0Var = (hoj0) map2.get(yo60.class)) == null || (goj0VarA = hoj0Var.a()) == null) ? null : goj0VarA.a;
                    yo60 yo60Var = obj3 instanceof yo60 ? (yo60) obj3 : null;
                    if (z3) {
                        String str7 = yo60Var != null ? yo60Var.b : null;
                        if (str7 != null && str7.length() != 0) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                lpd0Var.f.m((Object) null, arrayList2);
                return rih1.a;
            case 11:
                hm5.M(obj);
                if (x74.j((Context) this.d, ((see0) this.c).h) == 0) {
                    ((iu30) this.b).invoke(lee0.b);
                }
                return rih1.a;
            case 12:
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) ((Function0) this.d).invoke()).booleanValue();
                kpe0 kpe0Var = (kpe0) this.c;
                lzn0 lzn0Var = kpe0Var.a;
                lzn0Var.e();
                dwn0 dwn0Var = (dwn0) this.b;
                if (dwn0Var == null) {
                    return null;
                }
                lzn0Var.f(dwn0Var);
                if (zBooleanValue) {
                    kpe0Var.c.a(new IllegalStateException("MUP lock page restored after verification succeeded"));
                }
                return rih1.a;
            case 13:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.c;
                nav0 nav0Var = (nav0) this.d;
                b4e1 b4e1Var = (b4e1) this.b;
                fn31.T(c9nVar, (o8n) null, 4, new s7n(nav0Var, b4e1Var, (lnm) null, (byte) 1), 1);
                return fn31.T(c9nVar, (o8n) null, 4, new s7n(nav0Var, b4e1Var, (lnm) null, (byte) 2), 1);
            case 14:
                l7p0 l7p0Var = (l7p0) this.b;
                hm5.M(obj);
                boolean z4 = ((jzf0) this.c).a;
                m0g0 m0g0Var = (m0g0) this.d;
                if (z4) {
                    m0g0Var.b.b(l7p0Var, new i7p0(true));
                } else {
                    m0g0Var.b.b(l7p0Var, new i7p0(false));
                }
                return rih1.a;
            case 15:
                hm5.M(obj);
                ((y2g0) this.c).a.c((String) this.b, "mtr");
                ((Function0) this.d).invoke();
                return rih1.a;
            case 16:
                hm5.M(obj);
                fwg0 fwg0Var = (fwg0) this.c;
                String str8 = fwg0Var.c;
                if (str8.length() > 0 && fwg0Var.k == null) {
                    ((gw70) this.d).f(str8).g(new sqa0((ven0) this.b, (byte) 21), jtg0.d);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                f6h0 f6h0Var = (f6h0) this.d;
                hm5.M(obj);
                if (((a6h0) this.c).m) {
                    ((iu30) this.b).invoke(q3h0.a);
                    f6h0Var.f.J();
                    f6h0Var.k.a(ixb.c);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                lz20.b((lz20) this.c);
                b6t b6tVar = (k6a1) this.b;
                if (b6tVar != null) {
                    b6tVar.b();
                }
                ((Function0) this.d).invoke();
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                ((fth0) this.c).c.a((zsh0) this.d, (String) this.b);
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                rih1 rih1Var = rih1.a;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.b;
                hm5.M(obj);
                try {
                    try {
                        try {
                            ne neVar = new ne((byte) 9);
                            neVar.e0((String) this.c);
                            jf01 jf01VarA = ((cxc) ((yge0) this.d).b).a(new ln21(neVar));
                            jf01VarA.f.g(15L, TimeUnit.SECONDS);
                            ry21 ry21VarE = jf01VarA.e();
                            if (ry21VarE.Q0) {
                                InputStream inputStreamA = ry21VarE.g.a();
                                try {
                                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                                    try {
                                        o0c.w(inputStreamA, autoCloseOutputStream);
                                        autoCloseOutputStream.close();
                                        inputStreamA.close();
                                        ry21VarE.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            u890.p(autoCloseOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        u890.p(inputStreamA, th3);
                                        throw th4;
                                    }
                                }
                            } else {
                                ry21VarE.close();
                                parcelFileDescriptor.closeWithError("Canvas download failed: " + ry21VarE.d);
                            }
                        } catch (IOException e) {
                            Logger.e(e, "Exception while downloading canvas video.", new Object[0]);
                            parcelFileDescriptor.getClass();
                            parcelFileDescriptor.closeWithError("Canvas download failed");
                        }
                    } catch (CancellationException e2) {
                        parcelFileDescriptor.getClass();
                        try {
                            parcelFileDescriptor.closeWithError("Canvas download cancelled");
                            break;
                        } catch (IllegalStateException unused) {
                        }
                        throw e2;
                    } catch (Exception e3) {
                        Logger.e(e3, "Exception while downloading canvas video.", new Object[0]);
                        n57.e("Unexpected exception downloading canvas: ".concat(e3.getClass().getSimpleName()));
                        parcelFileDescriptor.getClass();
                        parcelFileDescriptor.closeWithError("Canvas download failed");
                    }
                } catch (IllegalStateException unused2) {
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                k091 k091Var = (o091) this.c;
                if (k091Var instanceof k091) {
                    if (((u5i0) this.d).X) {
                        h091 h091Var = k091Var.a;
                        if (!h091Var.equals(e091.a) && !h091Var.equals(f091.a)) {
                            ((iu30) this.b).invoke(g5i0.a);
                        }
                    } else {
                        ((iu30) this.b).invoke(g5i0.a);
                    }
                }
                return rih1.a;
            case 22:
                ven0 ven0Var = (ven0) this.b;
                hm5.M(obj);
                if (((Boolean) ((tob1) this.d).getValue()).booleanValue() && ((vm70) ven0Var.getValue()) != null) {
                    ((k8i0) this.c).f.a((vm70) ven0Var.getValue());
                }
                return rih1.a;
            case 23:
                hm5.M(obj);
                String str9 = (String) this.d;
                bx5 bx5Var = (bx5) this.b;
                try {
                    Uri uri = Uri.parse(str9);
                    String scheme = uri.getScheme();
                    if (scheme == null) {
                        length = new File(str9).length();
                    } else {
                        int iHashCode = scheme.hashCode();
                        if (iHashCode != 3143036) {
                            if (iHashCode == 951530617 && scheme.equals("content")) {
                                Cursor cursorQuery = bx5Var.a.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                                if (cursorQuery != null) {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_size");
                                            if (!cursorQuery.isNull(columnIndexOrThrow)) {
                                                length = cursorQuery.getLong(columnIndexOrThrow);
                                            } else {
                                                length = 0;
                                            }
                                        } else {
                                            length = 0;
                                        }
                                        cursorQuery.close();
                                        break;
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            u890.p(cursorQuery, th5);
                                            throw th6;
                                        }
                                    }
                                } else {
                                    length = 0;
                                }
                            } else {
                                length = new File(str9).length();
                            }
                        } else if (scheme.equals("file")) {
                            String path = uri.getPath();
                            if (path != null) {
                                length = new File(path).length();
                            } else {
                                length = 0;
                            }
                        } else {
                            length = new File(str9).length();
                        }
                    }
                    m231Var = new Long(length);
                } catch (Throwable th7) {
                    m231Var = new m231(th7);
                }
                return m231Var instanceof m231 ? new Long(0L) : m231Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                rih1 rih1Var2 = rih1.a;
                hm5.M(obj);
                spj0 spj0Var = (spj0) this.c;
                if (spj0Var.Z == this.d) {
                    ps41 ps41Var = (ps41) ((p811) this.b).a;
                    if (ps41Var != null) {
                        spj0Var.b(ps41Var, false);
                    }
                    spj0Var.f();
                }
                return rih1Var2;
            case 25:
                String str10 = (String) this.b;
                hm5.M(obj);
                tv80 tv80Var = (tv80) this.c;
                buj0 buj0Var = (buj0) this.d;
                if (tv80Var == null) {
                    buj0Var.f.h(str10);
                } else {
                    buj0Var.f.a(str10, tv80Var, (Bundle) null);
                }
                return rih1.a;
            case 26:
                hm5.M(obj);
                spn spnVar = ((avj0) this.c).c;
                String str11 = ((qmn) this.d).a;
                spn.b(spnVar, new cqn((String) null, (String) null, new zpn(true, (List) null, (List) null, (List) null, str11, str11, (ypn) null, false, 1851), 3), (tv80) this.b);
                return rih1.a;
            case 27:
                hm5.M(obj);
                MobileReportWorker mobileReportWorker = (MobileReportWorker) this.c;
                c7n1 c7n1Var = ((RavelinWorker) mobileReportWorker).h;
                if (c7n1Var == null) {
                    u890.C("endpointClient");
                    throw null;
                }
                dxc dxcVarA = c7n1Var.a.a(l1d.m("token ", (String) this.d), (MobileReportRequest) this.b);
                if (mobileReportWorker.b()) {
                    return new v8d0();
                }
                sy21 sy21VarC = dxcVarA.c();
                if (mobileReportWorker.b()) {
                    return new v8d0();
                }
                sy21VarC.getClass();
                return sy21VarC.a.Q0 ? y8d0.a() : new w8d0();
            case 28:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) this.b;
                krm0 krm0Var = (krm0) ven0Var2.getValue();
                krm0 krm0Var2 = ((mrm0) this.c).a;
                if (krm0Var != krm0Var2) {
                    ((wrm0) this.d).t.invoke(krm0Var2);
                    ven0Var2.setValue(krm0Var2);
                }
                return rih1.a;
            default:
                c9n c9nVar2 = (c9n) this.c;
                hm5.M(obj);
                wdm wdmVar = (wdm) this.d;
                fn31.T(c9nVar2, (o8n) null, 0, new mwm0(wdmVar, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new mwm0(wdmVar, (lnm) null, (byte) 1), 3);
                o0i o0iVar = (o0i) this.b;
                fn31.T(c9nVar2, (o8n) null, 0, new owm0(wdmVar, o0iVar, n6r0Var, b2), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new mwm0(wdmVar, (lnm) null, (byte) 2), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new owm0(wdmVar, o0iVar, n6r0Var, z2 ? 1 : 0), 3);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az80(Object obj, Object obj2, Object obj3, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az80(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az80(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az80(iu30 iu30Var, bcb0 bcb0Var, acb0 acb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.b = iu30Var;
        this.c = bcb0Var;
        this.d = acb0Var;
    }
}
