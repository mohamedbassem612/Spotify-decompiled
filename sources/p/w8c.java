package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w8c extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8c(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((lzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 1:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((kzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                return new n7d(str, (t7d) obj);
            case 5:
                return new r7d(str, (t7d) obj);
            case 6:
                return new q7d(str, (t7d) obj);
            case 7:
                return new u7d(str, (t7d) obj);
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                ((qv00) obj).a(str, prl.class, false);
                return rih1Var;
            case 10:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM message_id_and_capping WHERE messageKey = ?");
                try {
                    d441VarG1.K(1, str);
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 11:
                b261.n((e261) obj, str);
                return rih1Var;
            case 12:
                return new q0l0((i3l0) obj, str);
            case 13:
                return new f3l0((i3l0) obj, str);
            case 14:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((f3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 15:
                return ((w2l0) obj).e(str);
            case 16:
                return ((w2l0) obj).h(str);
            case 17:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mark_as_played", 1, Collections.singletonMap("item_played", str)), ((v0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mark_as_unplayed", 1, Collections.singletonMap("item_unplayed", str)), ((w0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((qv00) obj).a(str, dxc0.class, false);
                return rih1Var;
            case 20:
                b261.n((e261) obj, str);
                return rih1Var;
            case 21:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                return Boolean.valueOf(u890.j(((tom) obj).a, str));
            case 23:
                return Boolean.valueOf(u890.j(((tom) obj).a, str));
            case 24:
                return Boolean.valueOf(u890.j(((tom) obj).a, str));
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.t(e261Var, 0);
                return rih1Var;
            case 27:
                b261.n((e261) obj, str);
                return rih1Var;
            case 28:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                b261.n((e261) obj, str);
                return rih1Var;
        }
    }
}
