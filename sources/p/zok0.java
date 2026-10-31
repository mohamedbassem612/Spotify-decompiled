package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zok0 implements t9h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final List c;

    public zok0(String str, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-now-playing-pip";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("nowplaying");
                break;
            case 7:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-workout-settings-bottom-sheet";
                x6h1VarI2.f = "1.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = str;
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("fitness/workout-settings");
                break;
            default:
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-custom-reactions-picker";
                x6h1VarI3.f = "1.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.d = str;
                this.b = x6h1VarI3.a();
                this.c = Collections.singletonList("custom-reactions-picker");
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                break;
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                break;
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                break;
            case 4:
                r6h1 r6h1Var5 = r6h1.c;
                break;
            case 5:
                r6h1 r6h1Var6 = r6h1.c;
                break;
            case 6:
                r6h1 r6h1Var7 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var8 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public final l7h1 e() {
        byte b = this.a;
        List list = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = list;
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = list;
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = list;
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var4.e = list;
                return k7h1Var4.a();
            case 4:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var5.e = list;
                return k7h1Var5.a();
            case 5:
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1Var;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var6.e = list;
                return k7h1Var6.a();
            case 6:
                k7h1 k7h1Var7 = new k7h1();
                ((xjn) k7h1Var7).a = y6h1Var;
                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var7.e = list;
                return k7h1Var7.a();
            default:
                k7h1 k7h1Var8 = new k7h1();
                ((xjn) k7h1Var8).a = y6h1Var;
                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var8.e = list;
                return k7h1Var8.a();
        }
    }

    public w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 i() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), this.b, r6h1.c, System.currentTimeMillis());
    }

    public zok0(int i) {
        String str;
        this.a = (byte) 4;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-on-demand-trial-snackbar";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "download";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "shuffle";
        }
        x6h1VarI.b = str;
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("any");
    }

    public zok0(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-now-playing-video-playback-settings-menu";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("nowplaying");
                break;
            case 6:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-prompt-playlist-cap-page";
                x6h1VarI2.f = "2.0.0";
                x6h1VarI2.g = "22.0.0";
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("magpie/cap");
                break;
            default:
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-account-switching-picker";
                x6h1VarI3.f = "2.1.0";
                x6h1VarI3.g = "22.0.0";
                this.b = x6h1VarI3.a();
                this.c = Collections.singletonList("accountswitching/picker");
                break;
        }
    }

    public zok0(String str, String str2) {
        this.a = (byte) 5;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-prerelease-page";
        x6h1VarI.f = "7.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("prerelease");
    }
}
