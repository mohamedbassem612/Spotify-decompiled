package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.watchfeed.uiusecases.element.videothumbnail.VideoThumbnailView;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xaj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xaj1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x03af  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x03e7  */
    public final Object invoke(Object obj) {
        uoa uoaVarA;
        String str;
        bfj1 bfj1Var;
        int i;
        String str2;
        long j;
        long j2;
        String strA;
        int measuredWidth;
        boolean zS;
        String string;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 7;
        int i2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                adj1 adj1Var = (edj1) obj;
                e701 e701Var = (e701) obj2;
                adj1 adj1Var2 = adj1Var instanceof adj1 ? adj1Var : null;
                if (!(adj1Var2 != null ? adj1Var2.c() : false) && (uoaVarA = ((czs) e701Var.i).a()) != null) {
                    uoaVarA.u();
                    ((woa) e701Var.g).c(uoaVarA);
                }
                return rih1Var;
            case 1:
                mbj1 mbj1Var = (mbj1) obj;
                av0 av0Var = (av0) ((pt) obj2).h;
                ji0 ji0Var = mbj1Var.a;
                o2u0 o2u0VarB = av0Var.b(ji0Var, ji0Var.g.b);
                if (o2u0VarB != null) {
                    return new fdj1(mbj1Var.a, o2u0VarB, true, false, false, false, false);
                }
                hhg1.n("Required value was null.");
                return null;
            case 2:
                ji0 ji0Var2 = ((b7j1) obj).c.c;
                ((bcj1) obj2).m.b(ji0Var2);
                return new mbj1(ji0Var2);
            case 3:
                ji0 ji0Var3 = ((c7j1) obj).c.c;
                ((wcj1) obj2).m.b(ji0Var3);
                return new mbj1(ji0Var3);
            case 4:
                gi90 gi90Var = (gi90) obj;
                String str3 = gi90Var.c;
                cej1 cej1Var = (cej1) obj2;
                DateFormat dateFormat = cej1Var.O0;
                guj1 guj1Var = cej1Var.c;
                plb0 plb0Var = cej1Var.e;
                boolean zBooleanValue = ((Boolean) guj1Var.f.invoke(gi90Var.f16p)).booleanValue();
                String str4 = gi90Var.e;
                String string2 = gi90Var.d;
                long j3 = gi90Var.j;
                Set set = s4b1.f;
                blc0 blc0Var = blc0.ti;
                blc0 blc0Var2 = blc0.ui;
                if (!uic.h(str4, new blc0[]{blc0Var, blc0Var2}) && guj1Var.g && j3 > 0) {
                    if (string2.length() > 0) {
                        string2 = plb0Var.a.getContext().getResources().getString(2131962993, string2, dateFormat.format(Long.valueOf(j3 * 1000)));
                        string2.getClass();
                    } else {
                        string2 = dateFormat.format(Long.valueOf(j3 * 1000));
                    }
                }
                String str5 = string2;
                String str6 = gi90Var.b;
                String str7 = gi90Var.i;
                String str8 = gi90Var.e;
                String str9 = gi90Var.f;
                long j4 = gi90Var.g;
                long j5 = gi90Var.h;
                List list = (List) cej1Var.f.e();
                if (list != null) {
                    str = str8;
                    if (list.size() == 1 && (measuredWidth = plb0Var.c.getMeasuredWidth()) > 0) {
                        bfj1Var = new bfj1(measuredWidth, (measuredWidth * 9) / 16);
                    }
                    int i3 = gi90Var.n;
                    String str10 = gi90Var.o;
                    m4m m4mVar = gi90Var.l;
                    boolean z = gi90Var.m;
                    if (uic.h(str4, new blc0[]{blc0Var, blc0Var2})) {
                        if (guj1Var.c) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    } else if (guj1Var.b || cej1Var.b == null) {
                        i = 1;
                    } else {
                        i = 3;
                    }
                    boolean z2 = gi90Var.a;
                    if (guj1Var.a) {
                        str2 = gi90Var.k;
                    } else {
                        str2 = null;
                    }
                    j = gi90Var.t;
                    if (guj1Var.d == null && gi90Var.s) {
                        fiv0 fiv0Var = guj1Var.e;
                        j2 = j;
                        strA = fiv0Var != null ? fiv0Var.a(j2 * 1000) : null;
                    } else {
                        j2 = j;
                        strA = null;
                    }
                    return new zej1(str3, zBooleanValue, str5, str6, str, str9, str7, j4, j5, bfj1Var, str10, i3, m4mVar, z, str2, strA, j2, i, z2, gi90Var.q, gi90Var.r, gi90Var.s);
                }
                str = str8;
                bfj1Var = null;
                int i4 = gi90Var.n;
                String str11 = gi90Var.o;
                m4m m4mVar2 = gi90Var.l;
                boolean z3 = gi90Var.m;
                if (uic.h(str4, new blc0[]{blc0Var, blc0Var2})) {
                    if (guj1Var.c) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                } else if (guj1Var.b) {
                    i = 1;
                } else {
                    i = 1;
                }
                boolean z4 = gi90Var.a;
                if (guj1Var.a) {
                    str2 = gi90Var.k;
                } else {
                    str2 = null;
                }
                j = gi90Var.t;
                if (guj1Var.d == null) {
                    j2 = j;
                    strA = null;
                } else {
                    j2 = j;
                    strA = null;
                }
                return new zej1(str3, zBooleanValue, str5, str6, str, str9, str7, j4, j5, bfj1Var, str11, i4, m4mVar2, z3, str2, strA, j2, i, z4, gi90Var.q, gi90Var.r, gi90Var.s);
            case 5:
                ((kd31) obj).b(((zej1) obj2).n ? 0.4f : 1.0f);
                return rih1Var;
            case 6:
                return new kcf1((xtm0) obj2, (byte) 6);
            case 7:
                ktj1 ktj1Var = (ktj1) obj;
                wao0 wao0Var = (wao0) obj2;
                if (ktj1Var instanceof etj1) {
                    wao0Var.invoke(new h151(true, ((etj1) ktj1Var).b));
                } else if (ktj1Var instanceof htj1) {
                    wao0Var.invoke(new h151(true, ((htj1) ktj1Var).b));
                }
                return rih1Var;
            case 8:
                lv4 lv4Var = ((sfj1) obj2).h;
                int iOrdinal = ((usd) obj).ordinal();
                if (iOrdinal == 0) {
                    zS = lv4Var.s();
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    zS = lv4Var.r();
                }
                return Boolean.valueOf(zS);
            case 9:
                cas casVar = (a7m0) obj;
                casVar.a = zhi1.b1;
                casVar.d = vbh1.a1;
                casVar.e = vbh1.b1;
                casVar.a(new yvf1(i2, b2), new yvf1(i2, b3));
                t9y0 t9y0Var = (t9y0) obj2;
                casVar.c = new lud(t9y0Var.b, t9y0Var.c, new q1c1(2, (lnm) null, (byte) 25));
                return rih1Var;
            case 10:
                return new rxc0(((dfv) obj2).b);
            case 11:
                return ((iij1) obj2).b.a.f((Context) obj);
            case 12:
                suh1 suh1Var = (suh1) obj2;
                return Observable.combineLatest(new ObservableFromPublisher((FlowableMap) suh1Var.d), ((yjj1) suh1Var.e).a(), o9x0.U0).toFlowable(BackpressureStrategy.d);
            case 13:
                ((ExoPlayer) obj).t0(((pjj1) obj2).b);
                return rih1Var;
            case 14:
                ((ExoPlayer) obj).z0((rjj1) obj2);
                return rih1Var;
            case 15:
                return new ls9((mkj1) obj2, (Context) obj);
            case 16:
                bnj1 bnj1Var = (bnj1) obj2;
                return rqt0.u(hu20.e(bnj1Var.b, new vmj1((byte) 0, bnj1Var, ((hnj1) obj).a, (lnm) null)));
            case 17:
                kls0 kls0Var = (kls0) obj2;
                return ((Flowable) kls0Var.b).J(new ezb1(kls0Var, (byte) 20));
            case 18:
                abc0 abc0Var = (abc0) obj;
                v3t0 v3t0Var = (v3t0) obj2;
                abc0Var.a = new vbc1(v3t0Var, (lnm) null, (byte) 19);
                abc0Var.d = new u3t0(v3t0Var, (byte) 1);
                return rih1Var;
            case 19:
                ywv0 ywv0Var = (ywv0) obj2;
                return new x010(rqt0.u(yoi1.g((Observable) ywv0Var.c)), rqt0.u(((ytp0) ywv0Var.g).E((String) null)), new ap51(3, (lnm) null, (byte) 11), (byte) 1);
            case 20:
                ((qtr) obj).b(new bgb1((qhm) obj2, (lnm) null, (byte) 10));
                return rih1Var;
            case 21:
                ycl1 ycl1Var = (ycl1) ((rk41) obj2).c;
                ycl1Var.d.m((Object) null, Boolean.TRUE);
                return new kcf1(ycl1Var, (byte) 7);
            case 22:
                xnb xnbVar = (xnb) obj2;
                return d3p1.H(xnbVar.b, xnbVar.c, (xxj1) obj);
            case 23:
                Bundle bundle = (Bundle) obj;
                String str12 = ((b0k1) ((zrj1) obj2).c).a;
                bzj1 azj1Var = zyj1.a;
                if (bundle != null && (string = bundle.getString("selection_type")) != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != 96673) {
                        if (iHashCode == 1191572123 && string.equals("selected")) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("selected_ids");
                            u380 u380VarC = stringArrayList != null ? mqo1.C(stringArrayList) : null;
                            if (u380VarC != null && !u380VarC.isEmpty()) {
                                azj1Var = new azj1(u380VarC);
                            }
                        }
                    } else if (string.equals("all")) {
                        azj1Var = yyj1.a;
                    }
                }
                return new czj1(str12, fg91.b, azj1Var, (bundle == null || !bundle.getBoolean("sheet_displayed")) ? 1 : 2, bundle != null ? bundle.getInt("row_count") : 0);
            case 24:
                String str13 = ((i3k1) obj).a;
                if (str13.length() <= 0) {
                    return new huz("", (byte) 10);
                }
                qlb qlbVar = (qlb) obj2;
                return new cly0(d3p1.H(qlbVar.b, (o3r) qlbVar.f, str13), (byte) 22);
            case 25:
                b07 b07Var = (f07) obj;
                VideoThumbnailView videoThumbnailView = (VideoThumbnailView) obj2;
                ilh1 ilh1Var = videoThumbnailView.a;
                if (b07Var instanceof b07) {
                    Integer num = b07Var.a;
                    if (num == null) {
                        return rih1Var;
                    }
                    int iIntValue = num.intValue();
                    iu30 iu30Var = videoThumbnailView.d;
                    if (iu30Var == null) {
                        return rih1Var;
                    }
                    iu30Var.invoke(new e3k1(iIntValue));
                    return rih1Var;
                }
                if (b07Var instanceof c07) {
                    videoThumbnailView.b = true;
                    ((ArtworkView) ilh1Var.c).setVisibility(0);
                    ((IconVideo) ilh1Var.b).setVisibility(4);
                    return rih1Var;
                }
                if (!(b07Var instanceof e07)) {
                    eg.o();
                    return null;
                }
                ((ArtworkView) ilh1Var.c).setVisibility(4);
                ((IconVideo) ilh1Var.b).setVisibility(0);
                return rih1Var;
            case 26:
                ((qtr) obj).b(new efj1((o6k1) obj2, (lnm) null, (byte) 2));
                return rih1Var;
            case 27:
                return new kcf1((ffj1) obj2, (byte) 10);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return ((igx) obj2).a(null);
            default:
                return ((ych1) ((e821) obj2).a).b(((k9k1) obj).c);
        }
    }
}
