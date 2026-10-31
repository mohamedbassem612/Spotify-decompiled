package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vdn1 implements Predicate, Function {
    public static final vdn1 c;
    public static final vdn1 d;
    public static final vdn1 e;
    public static final vdn1 f;
    public final /* synthetic */ byte a;
    public String b;

    static {
        byte b = 0;
        c = new vdn1("TINK", b);
        d = new vdn1("CRUNCHY", b);
        e = new vdn1("LEGACY", b);
        f = new vdn1("NO_PREFIX", b);
    }

    public vdn1(m9x0 m9x0Var, String str) {
        this.a = (byte) 3;
        this.b = str;
    }

    public e09 a() {
        String str = this.b;
        if (str != null) {
            return new e09(str);
        }
        eg.m("Missing required properties: content");
        return null;
    }

    public Object apply(Object obj) {
        String str;
        kdz kdzVar;
        io70 io70Var;
        y1g1 y1g1Var;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        String str3;
        ktl ktlVar;
        boolean z = true;
        String string = null;
        f = null;
        Float f2 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str4 = null;
        string = null;
        switch (this.a) {
            case 2:
                sdy sdyVar = ((uv00) obj).a(sdy.class, this.b).b;
                return Boolean.valueOf((sdyVar != null ? sdyVar.a : 0) == 2);
            case 3:
                uv00 uv00Var = (uv00) obj;
                String str5 = this.b;
                jo70 jo70Var = uv00Var.a(jo70.class, str5).b;
                if (jo70Var == null || (str = jo70Var.a) == null) {
                    eg.m("Failed to retrieve name");
                    return null;
                }
                pnt pntVar = uv00Var.a(pnt.class, str5).b;
                if (pntVar != null) {
                    return new zm8(str, pntVar.a);
                }
                eg.m("Failed to retrieve description");
                return null;
            case 4:
            case 15:
            default:
                nl61 nl61Var = (nl61) obj;
                if (nl61Var instanceof ml61) {
                    return Single.just(this.b);
                }
                if (nl61Var instanceof jl61) {
                    return Single.error(new Exception("Failed to set playlist image"));
                }
                if (nl61Var instanceof il61) {
                    return Single.error(new Exception("Playlist image set was cancelled"));
                }
                return Single.error(new Exception("Unexpected worker status: " + nl61Var));
            case 5:
                s78 s78Var = ((uv00) obj).a(s78.class, this.b).b;
                return Boolean.valueOf(s78Var != null ? s78Var.b : false);
            case 6:
                Throwable th = (Throwable) obj;
                Logger.e(th, l1d.m("Failed to load entity info for entity, uri: ", this.b), new Object[0]);
                return new xae0(th);
            case 7:
                uv00 uv00Var2 = (uv00) obj;
                String str6 = this.b;
                mdz mdzVar = uv00Var2.a(mdz.class, str6).b;
                jo70 jo70Var2 = uv00Var2.a(jo70.class, str6).b;
                if (jo70Var2 != null && (io70Var = jo70Var2.e) != null) {
                    string = io70Var.b;
                } else if (mdzVar != null && (kdzVar = mdzVar.d) != null) {
                    string = kdzVar.b.toString();
                }
                return new g410(mdzVar != null ? mdzVar.l : false, string);
            case 8:
                f7h f7hVar = (f7h) ((Map) obj).get(this.b);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 9:
                f7h f7hVar2 = (f7h) ((Map) obj).get(this.b);
                return f7hVar2 == null ? om40.c : f7hVar2;
            case 10:
                String str7 = this.b;
                z1g1 z1g1Var = ((uv00) obj).a(z1g1.class, str7).b;
                if (z1g1Var == null || (y1g1Var = (y1g1) o7h.s0(z1g1Var.m)) == null) {
                    return z1g1Var != null ? "spotify:track:".concat(z1g1Var.a) : str7;
                }
                return y1g1Var.a;
            case 11:
                uv00 uv00Var3 = (uv00) obj;
                String str8 = this.b;
                jo70 jo70Var3 = uv00Var3.a(jo70.class, str8).b;
                xkk1 xkk1Var = uv00Var3.a(xkk1.class, str8).b;
                if (jo70Var3 == null || (str2 = jo70Var3.a) == null || str2.length() == 0) {
                    str2 = null;
                }
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null && (str3 = up70VarA.a.a) != null && str3.length() != 0) {
                    str4 = str3;
                }
                return new arp0(1, str2, str4);
            case 12:
                mtl mtlVar = ((uv00) obj).a(mtl.class, this.b).b;
                return (mtlVar == null || (ktlVar = mtlVar.a) == null) ? ktl.a : ktlVar;
            case 13:
                i1z i1zVar = (i1z) ((Map) obj).get(this.b);
                return i1zVar == null ? d1z.d : i1zVar.B;
            case 14:
                f7h f7hVar3 = (f7h) ((Map) obj).get(this.b);
                Boolean boolValueOf = f7hVar3 != null ? Boolean.valueOf(f7hVar3.c) : null;
                if (u890.j(boolValueOf, Boolean.TRUE)) {
                    return o841.b;
                }
                if (u890.j(boolValueOf, Boolean.FALSE)) {
                    return o841.c;
                }
                if (boolValueOf == null) {
                    return o841.a;
                }
                eg.o();
                return null;
            case 16:
                List list = (List) obj;
                String str9 = this.b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (u890.j(((zo91) it.next()).a, str9)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                return new e4a1(this.b, false);
            case 18:
                ro7 ro7Var = ((uv00) obj).a(ro7.class, this.b).b;
                float fFloatValue = 0.0f;
                if (ro7Var != null) {
                    float f3 = (float) ro7Var.a;
                    Float fValueOf = Float.valueOf(f3);
                    if (Math.abs(f3) <= Float.MAX_VALUE && f3 > 0.0f) {
                        f2 = fValueOf;
                    }
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                }
                return Float.valueOf(fFloatValue);
            case 19:
                Logger.e((Throwable) obj, "Error on shareMenuVisibilityEventSource for feature ".concat(this.b), new Object[0]);
                return Observable.empty();
        }
    }

    public void b(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null content");
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                PlayerState playerState = (PlayerState) obj;
                return playerState.isPlaying() && !playerState.isPaused() && playerState.track().c() && u890.j(playerState.contextUri(), this.b);
            default:
                return u890.j((String) ((mmr0) obj).a, this.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vdn1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public vdn1() {
        this.a = (byte) 4;
    }
}
