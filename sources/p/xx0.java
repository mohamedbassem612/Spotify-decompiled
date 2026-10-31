package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xx0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0() {
        super(3, (lnm) null);
        this.a = (byte) 11;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                new xx0(this.b, (lnm) obj3, (byte) 0).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                new xx0(this.b, (lnm) obj3, (byte) 1).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                new xx0(this.b, (lnm) obj3, (byte) 2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                long j = ((Offset) obj2).a;
                new xx0((upo) this.b, (lnm) obj3, b2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                new xx0(this.b, (lnm) obj3, (byte) 4).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                new xx0(this.b, (lnm) obj3, (byte) 5).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                new xx0(this.b, (lnm) obj3, (byte) 6).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                new xx0(this.b, (lnm) obj3, (byte) 7).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                PlayerState playerState = (PlayerState) obj;
                new xx0((int) b2, (lnm) obj3, (byte) 8).b = playerState;
                hm5.M(rih1Var);
                return playerState;
            case 9:
                new xx0(this.b, (lnm) obj3, (byte) 9).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                new xx0(this.b, (lnm) obj3, (byte) 10).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                xx0 xx0Var = new xx0((int) b2, (lnm) obj3, (byte) 11);
                xx0Var.b = (Intent) obj;
                return xx0Var.invokeSuspend(rih1Var);
            case 12:
                k2v k2vVar = (k2v) obj;
                new xx0((int) b2, (lnm) obj3, (byte) 12).b = k2vVar;
                hm5.M(rih1Var);
                return k2vVar;
            case 13:
                ((Number) obj).intValue();
                new xx0(this.b, (lnm) obj3, (byte) 13).invokeSuspend(rih1Var);
                return Boolean.FALSE;
            case 14:
                new xx0(this.b, (lnm) obj3, (byte) 14).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                new xx0(this.b, (lnm) obj3, (byte) 15).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                new xx0(this.b, (lnm) obj3, (byte) 16).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new xx0(this.b, (lnm) obj3, (byte) 17).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                new xx0(this.b, (lnm) obj3, (byte) 18).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                new xx0(this.b, (lnm) obj3, (byte) 19).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                xx0 xx0Var2 = new xx0((int) b2, (lnm) obj3, (byte) 20);
                xx0Var2.b = (km61) obj;
                xx0Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                new xx0(this.b, (lnm) obj3, (byte) 21).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                x751 x751Var = (x751) obj;
                new xx0((int) b2, (lnm) obj3, (byte) 22).b = x751Var;
                hm5.M(rih1Var);
                return x751Var;
            case 23:
                new xx0(this.b, (lnm) obj3, (byte) 23).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj2).floatValue();
                new xx0(this.b, (lnm) obj3, (byte) 24).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                spq0 spq0Var = (spq0) obj;
                new xx0((int) b2, (lnm) obj3, (byte) 25).b = spq0Var;
                hm5.M(rih1Var);
                return spq0Var;
            case 26:
                new xx0(this.b, (lnm) obj3, (byte) 26).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                new xx0(this.b, (lnm) obj3, (byte) 27).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                new xx0(this.b, (lnm) obj3, (byte) 28).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                new xx0(this.b, (lnm) obj3, (byte) 29).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        long jU;
        dxr0 dxr0Var;
        yxa0 parcelable;
        String string;
        String string2;
        byte b = this.a;
        ixb ixbVar = ixb.c;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                Logger.g(l1d.m("Failed to observe slot ", ((ay0) this.b).a.a), new Object[0]);
                return rih1Var;
            case 1:
                hm5.M(obj);
                uya uyaVar = (uya) this.b;
                j0d1 j0d1Var = uyaVar.l;
                if (j0d1Var != null) {
                    uyaVar.a.b(Collections.singleton(qe9.a));
                    j0d1Var.d((CancellationException) null);
                    uyaVar.l = null;
                    uyaVar.k.clear();
                    uyaVar.j.clear();
                    uyaVar.h.clear();
                    uyaVar.i.clear();
                    bpb1 bpb1Var = uyaVar.g;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, b7xVar);
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                xya xyaVar = (xya) this.b;
                j0d1 j0d1Var2 = xyaVar.g;
                if (j0d1Var2 != null) {
                    j0d1Var2.d((CancellationException) null);
                    xyaVar.g = null;
                    bpb1 bpb1Var2 = xyaVar.f;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, b7xVar);
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                upo upoVar = (upo) this.b;
                upoVar.j++;
                upoVar.b.setValue(Boolean.FALSE);
                upoVar.i = upoVar.c();
                return rih1Var;
            case 4:
                hm5.M(obj);
                wpr wprVar = (wpr) this.b;
                faa0 faa0Var = wprVar.c;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                wprVar.d = null;
                return rih1Var;
            case 5:
                hm5.M(obj);
                fut futVar = (fut) this.b;
                futVar.c.b(Collections.singleton(gut.a));
                op71.q(futVar.f.a, (CancellationException) null);
                futVar.h.m((Object) null, b7xVar);
                return rih1Var;
            case 6:
                hm5.M(obj);
                cx80 cx80Var = ((qmu) this.b).d;
                if (cx80Var != null) {
                    cx80Var.cancel();
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                ((m2v) this.b).b.a(ixbVar);
                return rih1Var;
            case 8:
                PlayerState playerState = (PlayerState) this.b;
                hm5.M(obj);
                return playerState;
            case 9:
                hm5.M(obj);
                jb3 jb3Var = (jb3) this.b;
                w2c1 w2c1Var = (y1c1) jb3Var.c;
                cot0 cot0Var = (cot0) w2c1Var.U(cot0.class).getValue();
                wp21 wp21Var = cot0Var.d;
                r4z r4zVar = cot0Var.a;
                p1p1 p1p1Var = cot0Var.c;
                boolean z = wp21Var instanceof xp21;
                if (!z && !cot0Var.e) {
                    if (p1p1Var instanceof zqt0) {
                        w2c1Var.T(wit0.a);
                        ((r0s0) jb3Var.d).t(r4zVar, ((zqt0) p1p1Var).c);
                    } else {
                        if (wp21Var instanceof wp21) {
                            wp21 wp21Var2 = wp21Var;
                            w2c1Var.T(new yit0(wp21Var2.c, wp21Var2.d));
                        } else if (wp21Var instanceof vp21) {
                            w2c1Var.T(new xit0(((vp21) wp21Var).c));
                        } else if (!z) {
                            eg.o();
                            return null;
                        }
                        ix7 ix7Var = (ix7) jb3Var.e;
                        wp21 wp21Var3 = cot0Var.d;
                        boolean z2 = wp21Var3 instanceof wp21;
                        ngv ngvVar = ngv.e;
                        ngv ngvVar2 = ngv.d;
                        if (z2) {
                            ytw0 ytw0Var = jfv.b;
                            jU = jfv.u(fdg1.l0(wp21Var3.c, ngvVar2), ngvVar);
                        } else if (wp21Var3 instanceof vp21) {
                            ytw0 ytw0Var2 = jfv.b;
                            jU = jfv.u(fdg1.l0(((vp21) wp21Var3).c, ngvVar2), ngvVar);
                        } else {
                            if (!(wp21Var3 instanceof xp21)) {
                                eg.o();
                                return null;
                            }
                            jU = 0;
                        }
                        String str = r4zVar.b;
                        int i = (int) (jU / 3600);
                        int i2 = ((int) (jU / 60)) - (i * 60);
                        long j = jU % 60;
                        er91 er91Var = new er91((fs91) null, ((Context) ix7Var.d).getString(2131962624, i > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Long.valueOf(j)}, 2))), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                        ow3 ow3Var = (ow3) ix7Var.c;
                        i8h1 i8h1Var = (i8h1) ow3Var.b;
                        fjl0 fjl0Var = (fjl0) ow3Var.c;
                        x6h1 x6h1VarC = fjl0Var.c.c();
                        x6h1VarC.i.add(new a7h1("receiver_snackbar", (String) null, (Integer) null, str, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).b = fjl0Var.b;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                        ((kt91) ix7Var.b).k(er91Var);
                    }
                }
                return rih1Var;
            case 10:
                hm5.M(obj);
                ((yzu) this.b).K();
                return rih1Var;
            case 11:
                Intent intent = (Intent) this.b;
                hm5.M(obj);
                Bundle extras = intent.getExtras();
                String str2 = (extras == null || (string2 = extras.getString("name")) == null) ? "" : string2;
                Bundle extras2 = intent.getExtras();
                String str3 = (extras2 == null || (string = extras2.getString("birthday")) == null) ? "" : string;
                Bundle extras3 = intent.getExtras();
                String string3 = extras3 != null ? extras3.getString("pin") : null;
                Bundle extras4 = intent.getExtras();
                if (extras4 == null || (dxr0Var = (dxr0) extras4.getParcelable("parental_controls")) == null) {
                    dxr0Var = new dxr0();
                }
                dxr0 dxr0Var2 = dxr0Var;
                Bundle extras5 = intent.getExtras();
                if (extras5 == null || (parcelable = extras5.getParcelable("key_flow_type")) == null) {
                    parcelable = txa0.a;
                }
                yxa0 yxa0Var = parcelable;
                String str4 = yxa0Var instanceof vxa0 ? ((vxa0) yxa0Var).a : null;
                Bundle extras6 = intent.getExtras();
                return new hrn0(qxa0.class, new rmc1(str2, str3, string3, dxr0Var2, yxa0Var, str4, extras6 != null ? (yq00) extras6.getParcelable("expected_account_type") : null), new c6w0(1, false, (hd5) null, 12));
            case 12:
                k2v k2vVar = (k2v) this.b;
                hm5.M(obj);
                return k2vVar;
            case 13:
                hm5.M(obj);
                ((ven0) this.b).setValue(Boolean.TRUE);
                return Boolean.FALSE;
            case 14:
                hm5.M(obj);
                ((fqz0) ((g2z) this.b).b).b = 0.0d;
                return rih1Var;
            case 15:
                hm5.M(obj);
                ((svh0) this.b).b = true;
                return rih1Var;
            case 16:
                hm5.M(obj);
                oev0 oev0Var = (oev0) this.b;
                int i3 = oev0Var.b - 1;
                oev0Var.b = i3;
                if (i3 == 0) {
                    oev0Var.d = null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                hm5.M(obj);
                return Boolean.valueOf(!((g5s) this.b).a.h(h5s.a, false));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                m8d1.a(((k0z0) this.b).c.d, f0z0.a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                ((los) ((et90) this.b).d).a(ixbVar);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                km61 km61Var = (km61) this.b;
                hm5.M(obj);
                km61.a(km61Var, "removeDownloads", (Bundle) null, false, 6);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                ((dt31) this.b).a.e("com.spotify.sidedrawer.sidedrawerimpl.accessory_state");
                return rih1Var;
            case 22:
                x751 x751Var = (x751) this.b;
                hm5.M(obj);
                return x751Var;
            case 23:
                hm5.M(obj);
                kvs0 kvs0Var = (kvs0) ((smp0) this.b).d;
                kvs0Var.d.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), kvs0Var.c.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                ((tb91) this.b).o.invoke();
                return rih1Var;
            case 25:
                spq0 spq0Var = (spq0) this.b;
                hm5.M(obj);
                return spq0Var;
            case 26:
                hm5.M(obj);
                alg1 alg1Var = (alg1) this.b;
                km61 km61Var2 = (km61) alg1Var.e;
                if (km61Var2 != null) {
                    new Handler(Looper.getMainLooper()).post(new mqh1(km61Var2, (Bundle) alg1Var.f, (byte) 0));
                }
                return rih1Var;
            case 27:
                hm5.M(obj);
                wzu.b((lzn0) ((rm5) this.b).a);
                return rih1Var;
            case 28:
                hm5.M(obj);
                ((ahl1) this.b).b.a(ixbVar);
                return rih1Var;
            default:
                hm5.M(obj);
                ((j0n1) this.b).c.c();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.b = obj;
    }
}
