package p;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class piu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                piu piuVar = new piu((qiu) this.d, (rzo0) obj2, lnmVar, (byte) 0);
                piuVar.b = ((gq0) obj).a;
                return piuVar;
            case 1:
                piu piuVar2 = new piu((yiu) this.d, (rzo0) obj2, lnmVar, (byte) 1);
                piuVar2.b = ((gq0) obj).a;
                return piuVar2;
            case 2:
                piu piuVar3 = new piu((vfv) this.d, (rfv) obj2, lnmVar, (byte) 2);
                piuVar3.b = obj;
                return piuVar3;
            case 3:
                piu piuVar4 = new piu((u63) this.d, (sfv) obj2, lnmVar, (byte) 3);
                piuVar4.b = obj;
                return piuVar4;
            case 4:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 4);
            case 5:
                return new piu((tv80) this.d, obj2, (String) this.b, lnmVar, (byte) 5);
            case 6:
                return new piu((tv80) this.d, obj2, (String) this.b, lnmVar, (byte) 6);
            case 7:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 7);
            case 8:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 8);
            case 9:
                return new piu(this.d, (String) this.b, (Parcelable) obj2, lnmVar, (byte) 9);
            case 10:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 10);
            case 11:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 11);
            case 12:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 12);
            case 13:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 13);
            case 14:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 14);
            case 15:
                piu piuVar5 = new piu((nho0) this.d, (iu30) obj2, lnmVar, (byte) 15);
                piuVar5.b = obj;
                return piuVar5;
            case 16:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                piu piuVar6 = new piu((p811) this.d, (jfe) obj2, lnmVar, (byte) 17);
                piuVar6.b = ((qge) obj).a;
                return piuVar6;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new piu(this.d, (String) this.b, (Parcelable) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new piu(this.d, (String) this.b, (Parcelable) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                piu piuVar7 = new piu((String) this.b, (String) obj2, lnmVar);
                piuVar7.d = obj;
                return piuVar7;
            case 22:
                piu piuVar8 = new piu((j7y) this.d, (Integer) obj2, lnmVar, (byte) 22);
                piuVar8.b = obj;
                return piuVar8;
            case 23:
                return new piu(this.d, (String) this.b, (Parcelable) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 24);
            case 25:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 25);
            case 26:
                piu piuVar9 = new piu((List) this.d, (tm) obj2, lnmVar, (byte) 26);
                piuVar9.b = obj;
                return piuVar9;
            case 27:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 27);
            case 28:
                return new piu(this.b, this.d, obj2, lnmVar, (byte) 28);
            default:
                piu piuVar10 = new piu((l811) this.d, (rp80) obj2, lnmVar, (byte) 29);
                piuVar10.b = obj;
                return piuVar10;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        Object obj3 = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                String str = ((gq0) obj).a;
                piu piuVar = new piu((qiu) this.d, (rzo0) obj3, (lnm) obj2, (byte) 0);
                piuVar.b = str;
                piuVar.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                String str2 = ((gq0) obj).a;
                piu piuVar2 = new piu((yiu) this.d, (rzo0) obj3, (lnm) obj2, (byte) 1);
                piuVar2.b = str2;
                piuVar2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((whx0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((whx0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object obj4 = ((qge) obj).a;
                piu piuVar3 = new piu((p811) this.d, (jfe) obj3, (lnm) obj2, (byte) 17);
                piuVar3.b = obj4;
                piuVar3.invokeSuspend(rih1Var);
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
                return create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                create((op80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        BitmapFactory.Options options;
        sm00 sm00Var;
        byte b = this.a;
        int i = 1;
        bwn0 bwn0VarDecodeRegion = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                String str = (String) this.b;
                hm5.M(obj);
                rzo0 rzo0Var = (rzo0) obj2;
                if (rzo0Var != null) {
                    rzo0Var.F(str, u6t.a1);
                }
                return rih1Var;
            case 1:
                String str2 = (String) this.b;
                hm5.M(obj);
                ((rzo0) obj2).F(str2, new ots((yiu) this.d, (byte) 26));
                return rih1Var;
            case 2:
                whx0 whx0Var = (whx0) this.b;
                hm5.M(obj);
                iix0 iix0Var = (iix0) whx0Var.a.get(((rfv) obj2).a);
                return iix0Var == null ? new hix0(false, 0L) : iix0Var;
            case 3:
                whx0 whx0Var2 = (whx0) this.b;
                hm5.M(obj);
                iix0 iix0Var2 = (iix0) whx0Var2.a.get(((sfv) obj2).a);
                return iix0Var2 == null ? new hix0(false, 0L) : iix0Var2;
            case 4:
                hm5.M(obj);
                ((e2w) this.b).a.a(((c2w) this.d).a, (tv80) obj2);
                return rih1Var;
            case 5:
                hm5.M(obj);
                tv80 tv80Var = (tv80) this.d;
                if (tv80Var == null) {
                    return null;
                }
                ((lzn0) ((yzu) obj2).b).a((String) this.b, tv80Var, (Bundle) null);
                return rih1Var;
            case 6:
                hm5.M(obj);
                tv80 tv80Var2 = (tv80) this.d;
                if (tv80Var2 == null) {
                    return null;
                }
                ((lzn0) ((yzu) obj2).b).a((String) this.b, tv80Var2, (Bundle) null);
                return rih1Var;
            case 7:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj2;
                l2u0 l2u0Var = new l2u0(true, 0L, 0L, 0L, ((bf3) this.b).a.b(), 1.0f, (Integer) null, (Integer) null, 448);
                n2u0 n2u0Var = ((o0i) this.d).c.b;
                if (n2u0Var != null) {
                    n2u0Var.b(l2u0Var);
                }
                ven0Var.setValue(l2u0Var);
                return rih1Var;
            case 8:
                hm5.M(obj);
                ((k0t) this.b).c(new vxz(new sqj1((ljj1) this.d, "watch-feed-entrypoint-entity-explorer", new rqj1(9, ((x75) ((j3v) obj2).b).a()))));
                return rih1Var;
            case 9:
                hm5.M(obj);
                tv80 tv80Var3 = (tv80) obj2;
                ((gvy) this.d).b.f(new dwn0((String) this.b, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var3 != null ? new bwn0(tv80Var3) : null));
                return rih1Var;
            case 10:
                hm5.M(obj);
                e8z e8zVar = (e8z) this.b;
                vu1 vu1Var = e8zVar.e;
                uv11 uv11Var = (uv11) this.d;
                vu1.b(vu1Var, Collections.singletonList(uv11Var.a), e8zVar.b.a, uv11Var.b, (tv80) obj2, (dy1) null, 48);
                return rih1Var;
            case 11:
                hm5.M(obj);
                b9z b9zVar = (b9z) this.b;
                vgm vgmVar = b9zVar.b;
                jmb1 jmb1Var = (unb1) this.d;
                String str3 = jmb1Var.a.a;
                String str4 = b9zVar.e.a;
                tv80 tv80Var4 = (tv80) obj2;
                z8z z8zVar = (z8z) b9zVar.c.invoke();
                tv11 tv11Var = jmb1Var.a.f;
                vgmVar.d(str3, str4, tv80Var4, tgm.a(zpn1.x(z8z.a(z8zVar, tv11Var != null ? tv11Var.a : null), jmb1Var.a.d), false, false, 0, k4p1.w(jmb1Var.o), (sgm) null, (iu30) null, (p860) null, false, -131073));
                return rih1Var;
            case 12:
                hm5.M(obj);
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    lz20.b((lz20) this.d);
                    b6t b6tVar = (k6a1) obj2;
                    if (b6tVar != null) {
                        b6tVar.b();
                    }
                }
                return rih1Var;
            case 13:
                mr10 mr10Var = (mr10) this.b;
                hm5.M(obj);
                er10 er10Var = (er10) ((ven0) this.d).getValue();
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue() && er10Var != null) {
                    mr10Var.h.a(er10Var);
                    mr10Var.g.l((Object) null);
                }
                return rih1Var;
            case 14:
                hm5.M(obj);
                String str5 = (String) ((ven0) obj2).getValue();
                if (str5 != null && ((wv10) this.b).e == null) {
                    ((iu30) this.d).invoke(new gv10(str5));
                }
                return rih1Var;
            case 15:
                String str6 = (String) this.b;
                hm5.M(obj);
                if (!u890.j(str6, ((nho0) this.d).a)) {
                    ((iu30) obj2).invoke(str6);
                }
                return rih1Var;
            case 16:
                List list = (List) this.d;
                bw91 bw91Var = (bw91) this.b;
                hm5.M(obj);
                if (((String) ((ven0) obj2).getValue()) == null && !u890.j(bw91Var, list)) {
                    bw91Var.clear();
                    bw91Var.addAll(list);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object obj3 = this.b;
                hm5.M(obj);
                p811 p811Var = (p811) this.d;
                boolean z = obj3 instanceof pge;
                if (!z) {
                    p811Var.a = obj3;
                }
                jfe jfeVar = (jfe) obj2;
                if (z) {
                    Throwable thA = qge.a(obj3);
                    if (thA != null) {
                        throw thA;
                    }
                    jfeVar.d(new ChildCancelledException());
                    p811Var.a = wqn1.c;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                ser serVar = ((cn30) this.d).b;
                String str7 = (String) this.b;
                String str8 = nik1.z5.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("free.user.shuffle.upsell.sheet.args", (en30) obj2);
                serVar.a(str7, str8, bundle);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                lzn0 lzn0Var = (lzn0) ((wdm) this.d).X;
                String str9 = (String) this.b;
                lzn0Var.a("spotify:gatedcontent:bottomsheet:".concat(ihc1.V0(str9, ':', str9)), (tv80) obj2, (Bundle) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                t740 t740Var = (t740) ((wdm) this.b).c;
                m840 m840Var = (m840) this.d;
                String str10 = m840Var.a;
                String str11 = m840Var.b;
                t740Var.a(str10, str11.length() == 0 ? null : str11, "spotify:windowed-song:click", m840Var.a, (tv80) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                cen0 cen0Var = (cen0) this.d;
                cen0 cen0VarB = cen0Var.b();
                String str12 = (String) this.b;
                String str13 = (String) obj2;
                mnv0 mnv0Var = at40.g;
                w7x w7xVar = (Set) cen0Var.a.get(mnv0Var);
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                cen0VarB.a(mnv0Var, dm61.x0(str12, w7xVar));
                ys40 ys40Var = at40.d;
                mma0[] mma0VarArr = ys40.a;
                ys40Var.getClass();
                cen0VarB.a(rc2.H("provider:".concat(str12)), str13);
                return cen0VarB.c();
            case 22:
                cen0 cen0Var2 = (cen0) this.b;
                hm5.M(obj);
                cen0Var2.a(ot11.K((j7y) this.d), (Integer) obj2);
                return rih1Var;
            case 23:
                hm5.M(obj);
                vy40 vy40Var = (vy40) this.d;
                ((lzn0) vy40Var.a.get()).a((String) this.b, (tv80) obj2, (Bundle) null);
                ((los) vy40Var.b.get()).a(ixb.c);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                String str14 = (String) this.b;
                tqw tqwVar = (tqw) this.d;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                ((lzn0) ((wy40) obj2).a.get()).f(new dwn0(str14, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
            case 25:
                hm5.M(obj);
                ((lh50) this.b).g.a(new yxe1(new ehc1(((jqi0) this.d).a)));
                lc20 lc20Var = (lc20) obj2;
                n7h1 n7h1Var = (n7h1) lc20Var.c;
                if (n7h1Var != null) {
                    n7h1Var.h(((wqk0) lc20Var.d).e());
                }
                return rih1Var;
            case 26:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                tm tmVar = (tm) obj2;
                Iterator it = ((List) this.d).iterator();
                while (it.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new xr00((Object) tmVar, it.next(), (lnm) bwn0VarDecodeRegion, (byte) 28), 3);
                }
                return rih1Var;
            case 27:
                hm5.M(obj);
                st60 st60Var = (st60) ((wmy) this.b).b;
                Context context = (Context) st60Var.d;
                Uri uri = (Uri) this.d;
                RectF rectF = ((sx70) obj2).a;
                Uri uriK = Uri.EMPTY;
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        options = null;
                    } else {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        inputStreamOpenInputStream.close();
                    }
                    if (options == null) {
                        return uriK;
                    }
                    InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream2 == null) {
                        sm00Var = null;
                    } else {
                        sm00Var = new sm00(inputStreamOpenInputStream2);
                        inputStreamOpenInputStream2.close();
                    }
                    if (sm00Var == null) {
                        return uriK;
                    }
                    int i2 = sm00Var.i(1, "Orientation");
                    RectF rectFJ = st60.j(rectF, i2);
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    float f = i3;
                    int iU = jch0.U(rectFJ.left * f);
                    float f2 = i4;
                    int iU2 = jch0.U(rectFJ.top * f2);
                    int iU3 = jch0.U(rectFJ.width() * f);
                    int iU4 = jch0.U(rectFJ.height() * f2);
                    if (iU3 > iU4) {
                        iU3 = iU4;
                    }
                    Rect rect = new Rect(iU, iU2, iU + iU3, iU3 + iU2);
                    InputStream inputStreamOpenInputStream3 = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream3 != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        while ((rect.height() / i) * (rect.width() / i) >= 9000000) {
                            i *= 2;
                            break;
                        }
                        options2.inSampleSize = i;
                        context.getContentResolver().openInputStream(uri);
                        BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream3, false);
                        if (bitmapRegionDecoderNewInstance != null) {
                            bwn0VarDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options2);
                        }
                    }
                    if (bwn0VarDecodeRegion == null) {
                        return Uri.EMPTY;
                    }
                    uriK = st60Var.K(i2, bwn0VarDecodeRegion);
                    bwn0VarDecodeRegion.recycle();
                    uriK.getClass();
                    return uriK;
                } catch (IOException e) {
                    Logger.e(e, "Failed to create image", new Object[0]);
                }
                break;
            case 28:
                iu30 iu30Var = (iu30) this.d;
                hm5.M(obj);
                hi41 hi41Var = (ji41) this.b;
                if (hi41Var instanceof hi41) {
                    iu30Var.invoke(new h880(2, hi41Var.b));
                } else if (hi41Var instanceof ii41) {
                    ((q880) obj2).g.a(o8r0.b);
                    iu30Var.invoke(new i880(((ii41) hi41Var).b));
                } else if (u890.j(hi41Var, gi41.g)) {
                    iu30Var.invoke(new h880(1, null));
                }
                return rih1Var;
            default:
                rp80 rp80Var = (rp80) obj2;
                op80 op80Var = (op80) this.b;
                hm5.M(obj);
                l811 l811Var = (l811) this.d;
                if (l811Var.a) {
                    l811Var.a = false;
                    if (!u890.j(op80Var, rp80Var.g)) {
                        rp80Var.f(rp80Var.b, op80Var);
                    }
                } else {
                    rp80Var.f(rp80Var.b, op80Var);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(Object obj, String str, Parcelable parcelable, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.b = str;
        this.c = parcelable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piu(String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 21;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(tv80 tv80Var, Object obj, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = tv80Var;
        this.c = obj;
        this.b = str;
    }
}
