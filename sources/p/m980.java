package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m980 implements iw91, Function, ya, ft50, i761, Predicate {
    public static final m980 c;
    public static final m980 d;
    public final /* synthetic */ byte a;
    public boolean b;

    static {
        byte b = 0;
        c = new m980(b, true);
        d = new m980(b, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.wjp0 */
    public m980(yjp0 yjp0Var, xjp0 xjp0Var) throws wjp0 {
        this.a = (byte) 20;
        int i = xjp0Var.a;
        ByteBuffer byteBuffer = xjp0Var.b;
        dm5.m(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        bae baeVar = new bae(bArr, iMin);
        if (yjp0Var.a) {
            throw new wjp0();
        }
        if (baeVar.f()) {
            this.b = false;
            return;
        }
        int iG = baeVar.g(2);
        boolean zF = baeVar.f();
        if (yjp0Var.b) {
            throw new wjp0();
        }
        if (!zF) {
            this.b = true;
            return;
        }
        boolean zF2 = (iG == 3 || iG == 0) ? true : baeVar.f();
        baeVar.n();
        if (!yjp0Var.d) {
            throw new wjp0();
        }
        if (baeVar.f()) {
            if (!yjp0Var.e) {
                throw new wjp0();
            }
            baeVar.n();
        }
        if (yjp0Var.c) {
            throw new wjp0();
        }
        if (iG != 3) {
            baeVar.n();
        }
        baeVar.o(yjp0Var.f);
        if (iG != 2 && iG != 0 && !zF2) {
            baeVar.o(3);
        }
        this.b = ((iG == 3 || iG == 0) ? 255 : baeVar.g(8)) != 0;
    }

    public void a(tka0 tka0Var, tka0 tka0Var2, nma0 nma0Var) {
        yoi1 kind = nma0Var.getDescriptor().getKind();
        if ((kind instanceof scv0) || u890.j(kind, k661.h)) {
            jah.j("Serializer for ", tka0Var2.r(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
            return;
        }
        if (this.b) {
            if (u890.j(kind, uic1.i) || u890.j(kind, vic1.h) || (kind instanceof mnw0) || (kind instanceof l661)) {
                jah.j("Serializer for ", tka0Var2.r(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 8:
                return !this.b;
            default:
                return ((ksk) obj).c == le30.T0 && this.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 4:
                jx7 jx7Var = (jx7) obj;
                if (this.b) {
                    z = jx7Var.a.n(jx7Var.b.a);
                }
                return Boolean.valueOf(z);
            case 11:
                return new bc50(this.b);
            case 17:
                boolean z2 = !this.b;
                List list = ygl.a;
                return new jjf0(z2, xlk1.c);
            case 21:
                return ats0.e((l510) obj, this.b);
            case 22:
                return ats0.e((l510) obj, this.b);
            case 24:
                Boolean bool = (Boolean) obj;
                if (this.b && bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                boolean z3 = this.b && playerState.isBuffering();
                if (strUri != null && playerState.isPlaying() && playerState.isPaused() && !z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public boolean b() {
        return this.b;
    }

    public hi5 d() {
        hi5 hi5Var = new hi5((zyh) null, false);
        hi5Var.c = this.b;
        return hi5Var;
    }

    public boolean f(k291 k291Var) {
        return this.b;
    }

    public boolean g() {
        return this.b;
    }

    public String i() {
        return this.b ? upn1.s() : upn1.m();
    }

    public boolean j() {
        return this.b;
    }

    public t881 l() {
        xkg0 xkg0Var = new xkg0();
        Boolean bool = Boolean.TRUE;
        xkg0Var.put("link", bool);
        xkg0Var.put("isBook", bool);
        xkg0Var.put("isMusicAndTalk", bool);
        xkg0Var.put("publisher", bool);
        xkg0Var.put("covers", bool);
        xkg0Var.put("name", bool);
        xkg0Var.put("isExplicit", bool);
        xkg0Var.put("isFollowing", bool);
        xkg0Var.put("inCollection", bool);
        xkg0Var.put("showOfflineState", sqg0.J(new mmr0[]{new mmr0("offline", bool), new mmr0("syncProgress", bool)}));
        xkg0Var.put("latestPlayedEpisodeLink", bool);
        xkg0Var.put("consumptionOrder", bool);
        xkg0Var.put("mediaTypeEnum", bool);
        if (!this.b) {
            xkg0Var.put("playedTime", bool);
            xkg0Var.put("playedPercentage", bool);
        }
        return new t881(new y381((e3z) null, new x381(f46.i0(new Integer[]{90, 193, 52, 88, 31, 3, 114, 54, 91, 164, 178, 179, 127, 183, 148, 182, 78}), xkg0Var.b()), 5));
    }

    public /* synthetic */ void m() {
        this.b = true;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 23:
                return !((Boolean) obj).booleanValue() || this.b;
            default:
                List<l0l> list = (List) obj;
                boolean z = this.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (l0l l0lVar : list) {
                        if (z ? l0lVar.l() : l0lVar.isActive()) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return l1d.r(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
            default:
                return super.toString();
        }
    }

    public void c(tka0 tka0Var, iu30 iu30Var) {
    }

    public void e(tka0 tka0Var, iu30 iu30Var) {
    }

    public void k(tka0 tka0Var, iu30 iu30Var) {
    }

    public /* synthetic */ m980(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public /* synthetic */ m980(Object obj, boolean z, byte b) {
        this.a = b;
        this.b = z;
    }

    public m980(yx4 yx4Var) {
        this.a = (byte) 25;
        this.b = yx4Var.a();
    }

    public m980(k35 k35Var) {
        this.a = (byte) 26;
        this.b = k35Var.b();
    }

    public m980(rm4 rm4Var) {
        this.a = (byte) 16;
        this.b = rm4Var.a();
    }

    public m980(de4 de4Var) {
        this.a = (byte) 9;
        this.b = de4Var.a();
    }

    public m980(wt4 wt4Var) {
        this.a = (byte) 19;
        this.b = wt4Var.a();
    }

    public m980(kly0 kly0Var) {
        this.a = (byte) 14;
        this.b = ((y84) kly0Var.get()).a();
    }

    public m980(vfa0 vfa0Var) {
        this.a = (byte) 13;
        this.b = vfa0Var.l != 1;
    }

    public m980(c8c0 c8c0Var) {
        this.a = (byte) 2;
        this.b = zro1.v(c8c0Var);
    }

    public m980() {
        this.a = (byte) 5;
        this.b = true;
    }
}
