package p;

import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.scrollsita.v1.Section;
import java.security.SecureRandom;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class nda1 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nda1(byte b) {
        super(0, dp5.g, e0d1.class, "defaultNonce", "defaultNonce()[B", 0);
        this.a = b;
        switch (b) {
            case 24:
                super(0, s0u.a, s0u.class, "current", "current()Ljava/lang/String;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x024c  */
    public final Object invoke() {
        c1m0 c1m0Var;
        int i = 4;
        dia1 dia1VarValueOf = null;
        switch (this.a) {
            case 0:
                pda1 pda1Var = (pda1) ((lyc) this).receiver;
                if (pda1Var.h() == 2) {
                    brl0 brl0Var = pda1Var.m;
                    String strD = pda1Var.d();
                    if (!strD.equals("recently_played")) {
                        if (strD.equals("followed_artists")) {
                            i = 1;
                        } else if (strD.equals("liked_songs")) {
                            i = 2;
                        } else {
                            i = strD.equals("most_played") ? 3 : 0;
                        }
                    }
                    e1m0 e1m0Var = i != 0 ? new e1m0(brl0Var, i) : null;
                    if (e1m0Var != null) {
                        i8h1 i8h1Var = (i8h1) pda1Var.h.get();
                        x6h1 x6h1VarC = e1m0Var.a.c();
                        x6h1VarC.i.add(new a7h1("search_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        b7x b7xVar = b7x.a;
                        pda1Var.f(new lsn0((String) null, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                    }
                }
                return rih1.a;
            case 1:
                pda1 pda1Var2 = (pda1) ((lyc) this).receiver;
                int iH = pda1Var2.h();
                brl0 brl0Var2 = pda1Var2.m;
                String strE = pda1Var2.e();
                int iC = l1d.C(iH);
                if (iC == 0) {
                    c1m0Var = null;
                } else if (iC == 1) {
                    c1m0Var = new c1m0(brl0Var2, 3);
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    if (strE == null) {
                        c1m0Var = new c1m0(brl0Var2, 1);
                    } else {
                        if (strE.equals("artists")) {
                            i = 2;
                        } else if (!strE.equals("songs")) {
                            i = 0;
                        }
                        if (i != 0) {
                            c1m0Var = new c1m0(brl0Var2, i);
                        } else {
                            c1m0Var = null;
                        }
                    }
                }
                if (c1m0Var != null) {
                    i8h1 i8h1Var2 = (i8h1) pda1Var2.h.get();
                    x6h1 x6h1VarC2 = c1m0Var.a.c();
                    x6h1VarC2.i.add(new a7h1("search_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    b7x b7xVar2 = b7x.a;
                    tv80 tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("text_clear", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    if (iH == 3) {
                        pda1Var2.f(new lsn0((String) null, tv80VarM.a));
                    }
                }
                return rih1.a;
            case 2:
                ((su01) ((lyc) this).receiver).f("decorate_sponsorships");
                return rih1.a;
            case 3:
                SpotifyCheckoutActivity spotifyCheckoutActivity = (SpotifyCheckoutActivity) ((lyc) this).receiver;
                int i2 = SpotifyCheckoutActivity.D1;
                uba ubaVarD = spotifyCheckoutActivity.d();
                dsk0 dsk0Var = spotifyCheckoutActivity.r1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC4 = dsk0Var.b.c();
                x6h1VarC4.i.add(new a7h1("item_unavailable", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("go_back_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA3 = x6h1VarC5.a();
                b7x b7xVar3 = b7x.a;
                ubaVarD.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate_back", 1, b7xVar3), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                spotifyCheckoutActivity.m0().U(hyz.a);
                return rih1.a;
            case 4:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            case 5:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 6:
                String strF = ((dma1) ((ozb1) ((lyc) this).receiver).g(nzb1.b).b).f(uo31.d);
                if (strF != null) {
                    try {
                        dia1VarValueOf = Enum.valueOf(dia1.class, strF.toUpperCase(Locale.US));
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return dia1VarValueOf == dia1.f ? dia1.e : dia1.h;
            case 7:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 8:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 9:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 10:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 11:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.X;
            case 12:
                return ((ozb1) ((lyc) this).receiver).f().h(ozb1.x, false) ? dia1.g : dia1.h;
            case 13:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 14:
                ((ozb1) ((lyc) this).receiver).getClass();
                return dia1.h;
            case 15:
                return Boolean.valueOf(((wpv0) ((lyc) this).receiver).b.t());
            case 16:
                return Boolean.valueOf(((wpv0) ((lyc) this).receiver).b.t());
            case 17:
                return Boolean.valueOf(((wpv0) ((lyc) this).receiver).b.t());
            case 18:
                return Boolean.valueOf(((wpv0) ((lyc) this).receiver).b.d());
            case 19:
                ((e0d1) ((lyc) this).receiver).getClass();
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                return bArr;
            case 20:
                ((jto) ((lyc) this).receiver).dispose();
                return rih1.a;
            case 21:
                zvd1 zvd1Var = (zvd1) ((lyc) this).receiver;
                zvd1Var.d.a(new q6b(2, false));
                zvd1Var.b.e();
                return rih1.a;
            case 22:
                nwd1 nwd1Var = (nwd1) ((lyc) this).receiver;
                nwd1Var.d.a(new q6b(2, false));
                nwd1Var.b.e();
                return rih1.a;
            case 23:
                ((cxd1) ((lyc) this).receiver).a();
                return rih1.a;
            case 24:
                ((s0u) ((lyc) this).receiver).getClass();
                return s0u.f;
            case 25:
                kia kiaVar = (kia) ((lyc) this).receiver;
                kiaVar.c.setValue(kiaVar.a);
                return rih1.a;
            case 26:
                kia kiaVar2 = (kia) ((lyc) this).receiver;
                kiaVar2.c.setValue(kiaVar2.a);
                return rih1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                kia kiaVar3 = (kia) ((lyc) this).receiver;
                kiaVar3.c.setValue(kiaVar3.a);
                return rih1.a;
            case 28:
                kia kiaVar4 = (kia) ((lyc) this).receiver;
                kiaVar4.c.setValue(kiaVar4.a);
                return rih1.a;
            default:
                kia kiaVar5 = (kia) ((lyc) this).receiver;
                kiaVar5.c.setValue(kiaVar5.a);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nda1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
