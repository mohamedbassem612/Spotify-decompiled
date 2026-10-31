package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f0z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0z(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewBinderFound */
    /* JADX WARN: Type inference failed for: r1v78, types: [android.view.View, com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView] */
    public final Object invoke(Object obj) throws Exception {
        hws hwsVar;
        long j;
        long j2;
        byte b = this.a;
        hb10 bb10Var = null;
        int i = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                g0z g0zVar = (g0z) obj3;
                if (g0zVar.n() != -1 && (hwsVar = ((h0z) obj2).t) != null) {
                    hwsVar.invoke(Integer.valueOf(g0zVar.n()));
                }
                return rih1Var;
            case 1:
                return f6o1.A(new xzq(t1p.b((t1p) ((pbq) obj3).g, (d0r) obj2, (q8n) null, 5), lyy.f), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 2:
                ((qtr) obj).b(new woy((iu30) obj3, (goq) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 3:
                di4 di4Var = (di4) obj2;
                bi4 bi4VarR0 = di4Var.r0();
                boolean zV = di4Var.v();
                boolean zT = di4Var.t();
                boolean zI0 = di4Var.i0();
                wfx wfxVar = ((pp) obj3).b;
                return new lxr(wfxVar.b, wfxVar.a, bi4VarR0, zV, zT, zI0);
            case 4:
                ((Boolean) obj).getClass();
                ((iu30) obj2).invoke(((s7z) obj3).b.equals(qrt0.c) ? o7z.a : p7z.a);
                return rih1Var;
            case 5:
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.a;
                return new t671(32, str, xpn1.r(str, (ymd0) obj3), uv11Var.b, "episode-row-quick-action", (List) null, !((d771) obj2).a);
            case 6:
                ubw0 ubw0Var = (ubw0) obj;
                return new res((yqg) ((mev) obj3).b, ubw0Var, ubw0Var, (jcz) obj2);
            case 7:
                ((mez) obj3).f.onNext(new l300(((sh90) obj2).a));
                return rih1Var;
            case 8:
                h98 h98Var = new h98((Context) obj, (byte) 7);
                h98Var.n((iu30) obj3);
                h98Var.u((fgz) obj2);
                return (ConstraintLayout) ((tjq) h98Var.c).b;
            case 9:
                ((c1i) obj).a(rc11.a.b(pf3.class), q800.a, new f38(new pp(((xfx) ((qmr) obj3).b).c, (byte) 11), (byte) 2), (mvb) obj2);
                return rih1Var;
            case 10:
                ld00 ld00Var = (ld00) obj3;
                LinkedList linkedList = (LinkedList) obj2;
                ld00Var.getClass();
                if (linkedList.size() <= 999) {
                    ld00Var.a(linkedList);
                } else {
                    ArrayList arrayList = new ArrayList(999);
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                        if (arrayList.size() == 999) {
                            ld00Var.a(arrayList);
                            arrayList.clear();
                        }
                    }
                    if (arrayList.size() > 0) {
                        ld00Var.a(arrayList);
                    }
                }
                return rih1Var;
            case 11:
                d441 d441VarG1 = ((y341) obj).g1((String) obj3);
                try {
                    Iterator it2 = ((AbstractList) obj2).iterator();
                    while (it2.hasNext()) {
                        d441VarG1.n((byte[]) it2.next(), i);
                        i++;
                    }
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 12:
                d441 d441VarG2 = ((y341) obj).g1("SELECT sequenceNumberNext FROM EventSequenceNumbers WHERE eventName = ? AND sequenceId = ?");
                try {
                    d441VarG2.K(1, (String) obj3);
                    d441VarG2.n((byte[]) obj2, 2);
                    if (d441VarG2.f1()) {
                        j = d441VarG2.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return Long.valueOf(j);
                } finally {
                    d441VarG2.close();
                }
            case 13:
                ((ld00) obj3).b.D((y341) obj, (kd00) obj2);
                return rih1Var;
            case 14:
                d441 d441VarG3 = ((y341) obj).g1((String) obj3);
                try {
                    int i2 = 1;
                    for (byte[] bArr : (byte[][]) obj2) {
                        d441VarG3.n(bArr, i2);
                        i2++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (d441VarG3.f1()) {
                        arrayList2.add(new vd00(d441VarG3.P0(0), d441VarG3.P0(1), d441VarG3.getBlob(2), d441VarG3.P0(3), d441VarG3.isNull(6) ? null : Long.valueOf(d441VarG3.getLong(6)), d441VarG3.getLong(4), d441VarG3.getLong(5)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    d441VarG3.close();
                }
            case 15:
                ue00 ue00Var = (ue00) obj3;
                AbstractList abstractList = (AbstractList) obj2;
                if (abstractList.size() <= 999) {
                    ue00Var.a(abstractList);
                } else {
                    ArrayList arrayList3 = new ArrayList(999);
                    Iterator it3 = abstractList.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(it3.next());
                        if (arrayList3.size() == 999) {
                            ue00Var.a(arrayList3);
                            arrayList3.clear();
                        }
                    }
                    if (arrayList3.size() > 0) {
                        ue00Var.a(arrayList3);
                    }
                }
                return rih1Var;
            case 16:
                y341 y341Var = (y341) obj;
                qs0 qs0Var = ((ue00) obj3).c;
                ba00 ba00Var = (ba00) obj2;
                d441 d441VarG4 = y341Var.g1("INSERT OR ABORT INTO `Events` (`id`,`authenticated`,`eventName`,`sequenceId`,`sequenceNumber`,`fragments`,`owner`,`deviceId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)");
                try {
                    qs0Var.h(d441VarG4, ba00Var);
                    d441VarG4.f1();
                    o0c.v(d441VarG4, (Throwable) null);
                    if (jhc1.x(y341Var) == 0) {
                        j2 = -1;
                    } else {
                        d441 d441VarG5 = y341Var.g1("SELECT last_insert_rowid()");
                        try {
                            d441VarG5.f1();
                            long j3 = d441VarG5.getLong(0);
                            o0c.v(d441VarG5, (Throwable) null);
                            j2 = j3;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                o0c.v(d441VarG5, th);
                                throw th2;
                            }
                        }
                    }
                    return Long.valueOf(j2);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        o0c.v(d441VarG4, th3);
                        throw th4;
                    }
                }
            case 17:
                n720 n720Var = (t720) obj;
                tt80 tt80Var = tt80.j;
                iu30 iu30Var = (iu30) obj2;
                uny unyVar = (uny) obj3;
                if (n720Var instanceof n720) {
                    unyVar.z(tt80Var);
                    iu30Var.invoke(new rg00(n720Var.a));
                } else if (n720Var instanceof o720) {
                    unyVar.z(tt80Var);
                    o720 o720Var = (o720) n720Var;
                    iu30Var.invoke(new kh00(o720Var.a, o720Var.b));
                } else if (n720Var.equals(p720.a)) {
                    iu30Var.invoke(pg00.a);
                } else if (n720Var.equals(p720.b)) {
                    unyVar.z(tt80.i);
                } else if (n720Var instanceof q720) {
                    q720 q720Var = (q720) n720Var;
                    unyVar.z(new au80(q720Var.a, q720Var.b));
                } else if (n720Var instanceof r720) {
                    r720 r720Var = (r720) n720Var;
                    unyVar.z(new bu80(r720Var.a, r720Var.b));
                } else {
                    if (!(n720Var instanceof s720)) {
                        eg.o();
                        return null;
                    }
                    s720 s720Var = (s720) n720Var;
                    unyVar.z(new cu80(s720Var.a, s720Var.b));
                }
                return rih1Var;
            case 18:
                return new fu20((mr20) ((pdy) obj3).invoke(), new u98(2, (qj00) obj2, qj00.class, "appendToCache", "appendToCache(Lcom/spotify/listcontentruntime/configdsl/GroupDataUpdate;)V", 4, (byte) 7), (byte) 1);
            case 19:
                ji50 ji50Var = (ji50) obj;
                xk00 xk00Var = (xk00) obj2;
                Iterator it4 = ((qj00) obj3).a.a.iterator();
                while (it4.hasNext()) {
                    ((mj00) it4.next()).a(xk00Var, ji50Var);
                }
                return rih1Var;
            case 20:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                ((np00) obj3).b.post(new g2s((l6u0) obj2, Math.min(exoPlayer.v(), exoPlayer.getDuration()), (byte) 1));
                return rih1Var;
            case 21:
                qq00 qq00Var = (qq00) obj;
                nq00 nq00Var = (nq00) obj3;
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    qq00Var.x(nq00Var.a, nq00Var.c);
                } else {
                    qq00Var.w(nq00Var.a, nq00Var.b);
                }
                return rih1Var;
            case 22:
                sq00 sq00Var = (sq00) obj3;
                sq00Var.d.a = ((u6p0) obj2).a;
                return new k6r(sq00Var, (byte) 10);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ?? r1 = (ContentRestrictionBadgeView) obj;
                r1.f((k4m) obj3);
                r1.setContentDescription(((mr00) obj2).c);
                return rih1Var;
            case 24:
                ((qv00) obj).a((String) obj2, (Class) obj3, false);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                d441 d441VarG6 = ((y341) obj).g1("SELECT * FROM ExternalizationDisabledFilterEntity WHERE id = ?");
                try {
                    d441VarG6.K(1, (String) obj3);
                    int iW = y7y0.w(d441VarG6, "id");
                    int iW2 = y7y0.w(d441VarG6, "paths");
                    int iW3 = y7y0.w(d441VarG6, "revision");
                    int iW4 = y7y0.w(d441VarG6, "format");
                    if (d441VarG6.f1()) {
                        bb10Var = new bb10(d441VarG6.P0(iW), (int) d441VarG6.getLong(iW3), (int) d441VarG6.getLong(iW4), ((xa20) ((ab10) obj2).c.getValue()).a(d441VarG6.P0(iW2)));
                        break;
                    }
                    return bb10Var;
                } finally {
                    d441VarG6.close();
                }
            case 26:
                ((ab10) obj3).b.D((y341) obj, (bb10) obj2);
                return rih1Var;
            case 27:
                d441 d441VarG7 = ((y341) obj).g1("SELECT * FROM ExternalizationEnabledFilterEntity WHERE id = ?");
                try {
                    d441VarG7.K(1, (String) obj3);
                    int iW5 = y7y0.w(d441VarG7, "id");
                    int iW6 = y7y0.w(d441VarG7, "paths");
                    int iW7 = y7y0.w(d441VarG7, "revision");
                    int iW8 = y7y0.w(d441VarG7, "format");
                    if (d441VarG7.f1()) {
                        bb10Var = new hb10(d441VarG7.P0(iW5), (int) d441VarG7.getLong(iW7), (int) d441VarG7.getLong(iW8), ((xa20) ((gb10) obj2).c.getValue()).a(d441VarG7.P0(iW6)));
                        break;
                    }
                    return bb10Var;
                } finally {
                    d441VarG7.close();
                }
            case 28:
                ((gb10) obj3).b.D((y341) obj, (hb10) obj2);
                return rih1Var;
            default:
                FacePileView facePileView = (FacePileView) obj;
                facePileView.setFaceSize((int) (56.0f * facePileView.getContext().getResources().getDisplayMetrics().density));
                se10 se10Var = (se10) obj2;
                tto1.s((gw70) obj3, (af10) null, facePileView.a, se10Var.a, facePileView.c, se10Var.d);
                return rih1Var;
        }
    }
}
