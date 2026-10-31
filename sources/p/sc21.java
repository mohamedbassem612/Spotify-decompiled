package p;

import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sc21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc21(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                b2l0 b2l0Var = (b2l0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("rename_folder", 1, Collections.singletonMap("uri", str)), b2l0Var.a, r6h1.c, System.currentTimeMillis());
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                return ((c2l0) obj).e(str);
            case 3:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, m6k.class, true);
                qv00Var.a(str, jek.class, true);
                return rih1Var;
            case 4:
                b261.n((e261) obj, str);
                return rih1Var;
            case 5:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, jo70.class, false);
                qv00Var2.a(str, xkk1.class, false);
                return rih1Var;
            case 6:
                ((qv00) obj).a(str, jek.class, false);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                e261 e261Var = (e261) obj;
                if (str != null) {
                    b261.n(e261Var, str);
                }
                return rih1Var;
            case 9:
                b261.n((e261) obj, str);
                return rih1Var;
            case 10:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                if (str != null) {
                    b261.n(e261Var2, str);
                }
                return rih1Var;
            case 11:
                b261.n((e261) obj, str);
                return rih1Var;
            case 12:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 0);
                if (str != null) {
                    b261.n(e261Var3, str);
                }
                return rih1Var;
            case 13:
                e261 e261Var4 = (e261) obj;
                b261.x(e261Var4, 0);
                if (str != null) {
                    b261.n(e261Var4, str);
                }
                return rih1Var;
            case 14:
                b261.A((e261) obj, str);
                return rih1Var;
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case 17:
                return Boolean.valueOf(u890.j(((pt1) obj).getUri(), str));
            case 18:
                return new f2l0((i3l0) obj, str);
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case 20:
                b261.n((e261) obj, str);
                return rih1Var;
            case 21:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                b261.n((e261) obj, str);
                return rih1Var;
            case 24:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                e261 e261Var5 = (e261) obj;
                b261.n(e261Var5, str);
                b261.c(e261Var5);
                return rih1Var;
            case 26:
                return Boolean.valueOf(u890.j(((PlayerState) obj).contextMetadata().get("interactivity_state"), str));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Boolean.valueOf(u890.j(((pt1) obj).getUri(), str));
            case 28:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            default:
                e261 e261Var6 = (e261) obj;
                b261.C(e261Var6, new af5(str));
                b261.A(e261Var6, str);
                return rih1Var;
        }
    }
}
