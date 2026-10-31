package p;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y9k1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e821 b;

    public /* synthetic */ y9k1(e821 e821Var, byte b) {
        this.a = b;
        this.b = e821Var;
    }

    public final void accept(Object obj) {
        String str;
        byte b = this.a;
        uyu0 uyu0Var = bzu0.f;
        e821 e821Var = this.b;
        switch (b) {
            case 0:
                tun0 tun0Var = (tun0) e821Var.d;
                tv80 tv80Var = ((y8k1) obj).c;
                if (tun0Var.a()) {
                    if (tun0Var.g.o() && (tun0Var.h.a() instanceof twz0)) {
                        w6b1 w6b1VarA = f7b1.a(blc0.b4);
                        w6b1VarA.getClass();
                        str = (String) o7h.q0(w6b1VarA.c);
                    } else {
                        w6b1 w6b1VarA2 = f7b1.a(blc0.u4);
                        w6b1VarA2.getClass();
                        str = (String) o7h.q0(w6b1VarA2.c);
                    }
                    tun0Var.c.a(str, tv80Var, (Bundle) null);
                }
                break;
            case 1:
                tun0 tun0Var2 = (tun0) e821Var.d;
                tv80 tv80Var2 = ((x8k1) obj).c;
                tun0Var2.getClass();
                w6b1 w6b1VarA3 = f7b1.a(blc0.jf);
                String str2 = w6b1VarA3 != null ? (String) o7h.q0(w6b1VarA3.c) : null;
                if (tun0Var2.a() && str2 != null) {
                    tun0Var2.c.a(str2, tv80Var2, (Bundle) null);
                    break;
                }
                break;
            case 2:
                z8k1 z8k1Var = (z8k1) obj;
                tun0 tun0Var3 = (tun0) e821Var.d;
                String str3 = z8k1Var.d;
                tv80 tv80Var3 = z8k1Var.c;
                if (tun0Var3.a()) {
                    lzn0 lzn0Var = tun0Var3.c;
                    if (tv80Var3 == null) {
                        lzn0Var.h(str3);
                    } else {
                        lzn0Var.a(str3, tv80Var3, (Bundle) null);
                    }
                }
                break;
            case 3:
                v8k1 v8k1Var = (v8k1) obj;
                tun0 tun0Var4 = (tun0) e821Var.d;
                String str4 = v8k1Var.c;
                tv80 tv80Var4 = v8k1Var.d;
                boolean z = v8k1Var.e;
                boolean z2 = v8k1Var.f;
                boolean z3 = v8k1Var.g;
                boolean z4 = v8k1Var.h;
                s4b1 s4b1Var = tun0Var4.d;
                if (tun0Var4.a()) {
                    Bundle bundle = new Bundle();
                    if (z) {
                        bundle.putString("filter", "downloaded");
                    } else if (z2) {
                        bundle.putString("filter", "by_you");
                    } else if (z3) {
                        bundle.putString("filter", "by_spotify");
                    } else if (z4) {
                        bundle.putString("filter", "is_mixed");
                    }
                    v5b1 v5b1Var = s4b1Var.d;
                    if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, uyu0Var)) {
                        bundle.putString("parent_folder_uri", s4b1Var.z());
                    }
                    tun0Var4.c.a(str4, tv80Var4, bundle);
                }
                break;
            case 4:
                c9k1 c9k1Var = (c9k1) obj;
                tun0 tun0Var5 = (tun0) e821Var.d;
                String str5 = c9k1Var.c;
                tv80 tv80Var5 = c9k1Var.d;
                if (tun0Var5.a()) {
                    tun0Var5.c.a(str5, tv80Var5, (Bundle) null);
                }
                break;
            case 5:
                ((ych1) e821Var.a).a(((w8k1) obj).c);
                break;
            case 6:
                tun0 tun0Var6 = (tun0) e821Var.d;
                if (tun0Var6.a()) {
                    tun0Var6.c.e();
                }
                break;
            case 7:
                tun0 tun0Var7 = (tun0) e821Var.d;
                if (tun0Var7.a()) {
                    String strZ = tun0Var7.d.z();
                    if (tun0Var7.a() && strZ != null && strZ.length() != 0) {
                        tun0Var7.c.f(new dwn0(strZ, "", false, true, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                        break;
                    }
                }
                break;
            case 8:
                tun0 tun0Var8 = (tun0) e821Var.d;
                String str6 = nik1.w4.a;
                tv80 tv80Var6 = ((m9k1) obj).c;
                if (tun0Var8.a()) {
                    tun0Var8.c.a(str6, tv80Var6, (Bundle) null);
                }
                break;
            case 9:
                ((ych1) e821Var.a).e(((e9k1) obj).c);
                break;
            case 10:
                ((ych1) e821Var.a).d();
                break;
            case 11:
                b9k1 b9k1Var = (b9k1) obj;
                ych1 ych1Var = (ych1) e821Var.a;
                String str7 = b9k1Var.c;
                aey aeyVar = b9k1Var.f;
                String str8 = b9k1Var.d;
                s4b1 s4b1Var2 = (s4b1) e821Var.b;
                v5b1 v5b1Var2 = s4b1Var2.d;
                if (!u890.j(v5b1Var2 != null ? v5b1Var2.getType() : null, uyu0Var)) {
                    s4b1Var2 = null;
                }
                b3i1 b3i1VarZ = s4b1Var2 != null ? s4b1Var2.z() : null;
                if (aeyVar == aey.h && u890.j(b9k1Var.c, b3i1VarZ)) {
                    b3i1VarZ = b9k1Var.h;
                }
                b3i1 b3i1Var = b3i1VarZ;
                boolean z5 = b9k1Var.e;
                int iOrdinal = aeyVar.ordinal();
                rsi0 rsi0Var = rsi0.t;
                switch (iOrdinal) {
                    case 0:
                        rsi0Var = rsi0.a;
                        break;
                    case 1:
                        rsi0Var = rsi0.b;
                        break;
                    case 2:
                        rsi0Var = rsi0.c;
                        break;
                    case 3:
                        rsi0Var = rsi0.d;
                        break;
                    case 4:
                        rsi0Var = rsi0.e;
                        break;
                    case 5:
                        rsi0Var = rsi0.g;
                        break;
                    case 6:
                        rsi0Var = rsi0.h;
                        break;
                    case 7:
                        rsi0Var = rsi0.i;
                        break;
                    case 8:
                        rsi0Var = rsi0.f;
                        break;
                    case 9:
                        rsi0Var = rsi0.X;
                        break;
                    case 10:
                        rsi0Var = rsi0.Y;
                        break;
                    case 11:
                        rsi0Var = rsi0.N0;
                        break;
                    case 12:
                        rsi0Var = rsi0.O0;
                        break;
                    case 13:
                    case 14:
                        break;
                    default:
                        eg.o();
                        break;
                }
                ych1Var.f(new ssi0(rsi0Var, str7, z5, str8, b9k1Var.g, b3i1Var, b9k1Var.i, b9k1Var.j));
                break;
            case 12:
                ((ych1) e821Var.a).c(((p9k1) obj).c);
                break;
            case 13:
                tun0 tun0Var9 = (tun0) e821Var.d;
                Activity activity = tun0Var9.b;
                if (tun0Var9.a()) {
                    activity.startActivityForResult(tun0Var9.e.a(activity, EntryPoint.LIBRARY_ADD_ARTISTS), 101, tun0Var9.i);
                }
                break;
            case 14:
                tun0 tun0Var10 = (tun0) e821Var.d;
                Activity activity2 = tun0Var10.b;
                if (tun0Var10.a()) {
                    activity2.startActivityForResult(tun0Var10.e.a(activity2, EntryPoint.LIBRARY_ADD_PODCASTS), 102, tun0Var10.i);
                }
                break;
            case 15:
                tun0 tun0Var11 = (tun0) e821Var.d;
                tv80 tv80Var7 = ((u8k1) obj).c;
                if (tun0Var11.a()) {
                    tun0Var11.c.a("spotify:concerts", tv80Var7, (Bundle) null);
                }
                break;
            case 16:
                tun0 tun0Var12 = (tun0) e821Var.d;
                tv80 tv80Var8 = ((s8k1) obj).c;
                lik1 lik1Var = tun0Var12.a;
                if (tun0Var12.a()) {
                    v5b1 v5b1Var3 = tun0Var12.d.d;
                    boolean zJ = u890.j(v5b1Var3 != null ? v5b1Var3.getType() : null, uyu0Var);
                    jpn jpnVar = tun0Var12.f;
                    if (!zJ) {
                        jpnVar.a(lik1Var, tv80Var8, false);
                    } else {
                        jpnVar.a(lik1Var, tv80Var8, true);
                    }
                }
                break;
            default:
                t8k1 t8k1Var = (t8k1) obj;
                tun0 tun0Var13 = (tun0) e821Var.d;
                String str9 = t8k1Var.c;
                tv80 tv80Var9 = t8k1Var.d;
                String str10 = t8k1Var.e;
                boolean z6 = t8k1Var.f;
                if (tun0Var13.a()) {
                    Bundle bundle2 = new Bundle();
                    if (z6) {
                        bundle2.putString("filter", "downloaded");
                    }
                    if (str10 != null && str10.length() != 0) {
                        bundle2.putString("title", str10);
                    }
                    tun0Var13.c.a(str9, tv80Var9, bundle2);
                }
                break;
        }
    }
}
