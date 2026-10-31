package p;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nnu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnu(ven0 ven0Var, tob1 tob1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.c = ven0Var;
        this.b = tob1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new nnu((pfu) this.b, (ven0) obj2, lnmVar, (byte) 0);
            case 1:
                return new nnu((dou) this.b, (Function0) obj2, lnmVar, (byte) 1);
            case 2:
                return new nnu((nqu) this.b, (tqw) obj2, lnmVar, (byte) 2);
            case 3:
                return new nnu((Integer) this.b, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new nnu((p1v) this.b, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                return new nnu((luu) this.b, (euu) obj2, lnmVar, (byte) 5);
            case 6:
                return new nnu((g58) this.b, (z740) obj2, lnmVar, (byte) 6);
            case 7:
                nnu nnuVar = new nnu(obj2, lnmVar, (byte) 7);
                nnuVar.b = obj;
                return nnuVar;
            case 8:
                return new nnu((ven0) obj2, (tob1) this.b, lnmVar);
            case 9:
                return new nnu((t24) this.b, (tob1) obj2, lnmVar, (byte) 9);
            case 10:
                return new nnu((hdv) this.b, (rdv) obj2, lnmVar, (byte) 10);
            case 11:
                return new nnu((fcf0) this.b, (Map) obj2, lnmVar, (byte) 11);
            case 12:
                return new nnu((lz20) this.b, (ven0) obj2, lnmVar, (byte) 12);
            case 13:
                return new nnu((vqv) this.b, (zau0) obj2, lnmVar, (byte) 13);
            case 14:
                nnu nnuVar2 = new nnu(obj2, lnmVar, (byte) 14);
                nnuVar2.b = obj;
                return nnuVar2;
            case 15:
                return new nnu((String) this.b, (wvw) obj2, lnmVar, (byte) 15);
            case 16:
                nnu nnuVar3 = new nnu(obj2, lnmVar, (byte) 16);
                nnuVar3.b = obj;
                return nnuVar3;
            case 17:
                return new nnu((otu) this.b, (rpu) obj2, lnmVar, (byte) 17);
            case 18:
                return new nnu((o2y) this.b, (Function0) obj2, lnmVar, (byte) 18);
            case 19:
                return new nnu((l5y) this.b, (Function0) obj2, lnmVar, (byte) 19);
            case 20:
                return new nnu((otu) this.b, (g5y) obj2, lnmVar, (byte) 20);
            case 21:
                return new nnu((myq0) this.b, (sey) obj2, lnmVar, (byte) 21);
            case 22:
                return new nnu((iac0) this.b, (kgy) obj2, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new nnu((dqy) this.b, (ven0) obj2, lnmVar, (byte) 23);
            case 24:
                return new nnu((scz) this.b, (String) obj2, lnmVar, (byte) 24);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                nnu nnuVar4 = new nnu(obj2, lnmVar, (byte) 25);
                nnuVar4.b = obj;
                return nnuVar4;
            case 26:
                return new nnu((f800) this.b, (a800) obj2, lnmVar, (byte) 26);
            case 27:
                nnu nnuVar5 = new nnu(obj2, lnmVar, (byte) 27);
                nnuVar5.b = obj;
                return nnuVar5;
            case 28:
                return new nnu((ig00) this.b, (mf00) obj2, lnmVar, (byte) 28);
            default:
                return new nnu((qs00) this.b, (tv80) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((op80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((spq0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((uwz0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        Object obj2;
        switch (this.a) {
            case 0:
                ven0 ven0Var = (ven0) this.c;
                hm5.M(obj);
                pfu pfuVar = (pfu) this.b;
                if (pfuVar != null && ((pfu) ven0Var.getValue()) == null) {
                    ven0Var.setValue(pfuVar);
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                if (((dou) this.b).a()) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 2:
                hm5.M(obj);
                njm njmVar = ((nqu) this.b).a;
                tqw tqwVar = (tqw) this.c;
                njmVar.b(tqwVar != null ? n3o1.y(tqwVar) : null);
                return rih1.a;
            case 3:
                hm5.M(obj);
                ((ven0) this.c).setValue(Boolean.valueOf(((Integer) this.b) != null));
                return rih1.a;
            case 4:
                hm5.M(obj);
                ((ven0) this.c).setValue((p1v) this.b);
                return rih1.a;
            case 5:
                hm5.M(obj);
                ((luu) this.b).f.g(5, ((euu) this.c).b);
                return rih1.a;
            case 6:
                hm5.M(obj);
                x1i1.a(((g58) this.b).i, (z740) this.c, 6);
                return rih1.a;
            case 7:
                ayl aylVar = (ayl) this.c;
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                a2v a2vVar = (a2v) mmr0Var.a;
                j10 j10Var = (j10) mmr0Var.b;
                int i = a2vVar.b;
                String str = a2vVar.a;
                int iC = l1d.C(i);
                if (iC == 0) {
                    int iOrdinal = j10Var.ordinal();
                    if (iOrdinal == 0) {
                        ayl.b(aylVar, str, (String) null, 6);
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        ayl.c(aylVar, str, (String) null, 6);
                    }
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
                return rih1.a;
            case 8:
                hm5.M(obj);
                iu30 iu30Var = (iu30) ((ven0) this.c).getValue();
                Boolean bool = (Boolean) ((tob1) this.b).getValue();
                bool.booleanValue();
                iu30Var.invoke(bool);
                return rih1.a;
            case 9:
                hm5.M(obj);
                ((t24) this.b).j((wvr) ((tob1) this.c).getValue(), ma80.a);
                return rih1.a;
            case 10:
                hm5.M(obj);
                cdv cdvVar = ((hdv) this.b).b;
                adv advVar = cdvVar instanceof adv ? (adv) cdvVar : null;
                if (advVar != null) {
                    gcv gcvVar = advVar.c;
                    qdv qdvVarD = ((rdv) this.c).d();
                    gcvVar.invoke(qdvVarD != null ? qdvVarD.b : null);
                }
                return rih1.a;
            case 11:
                hm5.M(obj);
                fcf0 fcf0Var = (fcf0) this.b;
                if (fcf0Var != null) {
                    for (Map.Entry entry : ((Map) this.c).entrySet()) {
                        String str2 = (String) entry.getKey();
                        Bitmap bitmapCreateScaledBitmap = (Bitmap) entry.getValue();
                        hdf0 hdf0Var = (hdf0) ((HashMap) fcf0Var.c()).get(str2);
                        if (hdf0Var != null) {
                            int i2 = hdf0Var.b;
                            int i3 = hdf0Var.a;
                            if (bitmapCreateScaledBitmap.getWidth() != i3 || bitmapCreateScaledBitmap.getHeight() != i2) {
                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, i3, i2, true);
                            }
                            hdf0Var.f = bitmapCreateScaledBitmap;
                        }
                    }
                }
                return rih1.a;
            case 12:
                hm5.M(obj);
                if (((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    lz20.b((lz20) this.b);
                }
                return rih1.a;
            case 13:
                hm5.M(obj);
                ((vqv) this.b).e.a((zau0) this.c);
                return rih1.a;
            case 14:
                op80 op80Var = (op80) this.b;
                hm5.M(obj);
                r601 r601VarA = op80Var.a(kuw0.c);
                if (u890.j(r601VarA != null ? Boolean.valueOf(r601VarA.b) : null, Boolean.TRUE)) {
                    sqw sqwVar = (sqw) this.c;
                    if (((Boolean) sqwVar.f.invoke()).booleanValue() && (objInvoke = sqwVar.e.invoke()) != null && (obj2 = sqwVar.d.b.f) != null) {
                        try {
                            boolean zC = sqwVar.a.a().c(obj2, objInvoke, op80Var);
                            sqwVar.j = zC;
                            if (zC) {
                                int iIntValue = ((Number) sqwVar.g.invoke()).intValue();
                                sqwVar.a(iIntValue);
                                ztw ztwVarC = sqwVar.c();
                                if (ztwVarC != null) {
                                    ztwVarC.c(iIntValue, op80Var, new jzm(sqwVar, obj2, objInvoke, op80Var, (byte) 12));
                                }
                                sqwVar.a(iIntValue);
                            }
                        } catch (Exception e) {
                            sqwVar.c.invoke(e);
                            throw null;
                        }
                    }
                }
                return rih1.a;
            case 15:
                wvw wvwVar = (wvw) this.c;
                hm5.M(obj);
                if (((String) this.b) != null) {
                    wvwVar.U(rvw.a);
                    wvwVar.W(new jhv0("email_otp", "error_sdk_auth-client_challenge-proceed", 4, (String) null));
                }
                return rih1.a;
            case 16:
                spq0 spq0Var = (spq0) this.b;
                hm5.M(obj);
                ((d1x) this.c).d = (ContextTrack) spq0Var.h();
                return rih1.a;
            case 17:
                hm5.M(obj);
                otu otuVar = (otu) this.b;
                rpu rpuVar = (rpu) this.c;
                txk0 txk0Var = (txk0) otuVar.c;
                int iJ = bwp0.j(rpuVar);
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("commentary_confirmation_dialog", (String) null, (Integer) null, (String) null, z0l0.a(iJ)));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = txk0Var.c;
                ((i8h1) otuVar.b).f(k7h1Var.a(), (Set) null);
                return rih1.a;
            case 18:
                hm5.M(obj);
                if (((o2y) this.b).h) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 19:
                hm5.M(obj);
                if (((l5y) this.b).d) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 20:
                hm5.M(obj);
                otu otuVar2 = (otu) this.b;
                String str3 = ((g5y) this.c).a;
                txk0 txk0Var2 = (txk0) otuVar2.c;
                x6h1 x6h1VarC2 = txk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("language_confirmation_dialog", (String) null, (Integer) null, (String) null, str3));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = txk0Var2.c;
                ((i8h1) otuVar2.b).f(k7h1Var2.a(), (Set) null);
                return rih1.a;
            case 21:
                hm5.M(obj);
                ((myq0) this.b).n(((sey) this.c).a);
                return rih1.a;
            case 22:
                hm5.M(obj);
                ((iac0) this.b).getLifecycle().a((kgy) this.c);
                return rih1.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                hm5.M(obj);
                dqy dqyVar = (dqy) this.b;
                Map map = (Map) ((ven0) this.c).getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry2 : map.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), ((nar) entry2.getValue()).a);
                }
                dqyVar.d.replaceAll(new v87(linkedHashMap, (byte) 1));
                return rih1.a;
            case 24:
                hm5.M(obj);
                ((scz) this.b).d.invoke((String) this.c);
                return rih1.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                py21 py21Var = (py21) this.b;
                hm5.M(obj);
                return z561.k0(z561.f0(f9z.Y0, z561.T(new z5z((tdz) this.c, (byte) 1), z561.T(f9z.X0, new i46(((wsc0) py21Var.d()).e, (byte) 1)))));
            case 26:
                hm5.M(obj);
                lzn0 lzn0Var = ((f800) this.b).a;
                lzn0Var.e();
                a800 a800Var = (a800) this.c;
                lzn0Var.a(a800Var.a, a800Var.c, (Bundle) null);
                return rih1.a;
            case 27:
                uwz0 uwz0Var = (uwz0) this.b;
                hm5.M(obj);
                ((pb00) this.c).d = p2o1.I(uwz0Var);
                return rih1.a;
            case 28:
                hm5.M(obj);
                ig00 ig00Var = (ig00) this.b;
                mf00 mf00Var = (mf00) this.c;
                lzn0 lzn0Var2 = ig00Var.a;
                tv80 tv80Var = mf00Var.f;
                String str4 = mf00Var.e;
                if (tv80Var != null) {
                    lzn0Var2.a(str4, tv80Var, (Bundle) null);
                } else {
                    lzn0Var2.h(str4);
                }
                return rih1.a;
            default:
                hm5.M(obj);
                qs00 qs00Var = (qs00) this.b;
                ((lzn0) qs00Var.b.get()).a("spotify:premium-destination", (tv80) this.c, (Bundle) null);
                qs00Var.a.a(ixb.c);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnu(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnu(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
