package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nzu extends hab0 implements iu30 {
    public static final nzu N0;
    public static final nzu O0;
    public static final nzu P0;
    public static final nzu Q0;
    public static final nzu R0;
    public static final nzu S0;
    public static final nzu T0;
    public static final nzu U0;
    public static final nzu V0;
    public static final nzu W0;
    public static final nzu X;
    public static final nzu X0;
    public static final nzu Y;
    public static final nzu Y0;
    public static final nzu Z;
    public static final nzu Z0;
    public static final nzu a1;
    public static final nzu b;
    public static final nzu b1;
    public static final nzu c;
    public static final nzu c1;
    public static final nzu d;
    public static final nzu d1;
    public static final nzu e;
    public static final nzu e1;
    public static final nzu f;
    public static final nzu g;
    public static final nzu h;
    public static final nzu i;
    public static final nzu t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new nzu(i2, (byte) 0);
        c = new nzu(i2, (byte) 1);
        d = new nzu(i2, (byte) 2);
        e = new nzu(i2, (byte) 3);
        f = new nzu(i2, (byte) 4);
        g = new nzu(i2, (byte) 5);
        h = new nzu(i2, (byte) 6);
        i = new nzu(i2, (byte) 7);
        t = new nzu(i2, (byte) 8);
        X = new nzu(i2, (byte) 9);
        Y = new nzu(i2, (byte) 10);
        Z = new nzu(i2, (byte) 11);
        N0 = new nzu(i2, (byte) 12);
        O0 = new nzu(i2, (byte) 13);
        P0 = new nzu(i2, (byte) 14);
        Q0 = new nzu(i2, (byte) 15);
        R0 = new nzu(i2, (byte) 16);
        S0 = new nzu(i2, (byte) 17);
        T0 = new nzu(i2, (byte) 18);
        U0 = new nzu(i2, (byte) 19);
        V0 = new nzu(i2, (byte) 20);
        W0 = new nzu(i2, (byte) 21);
        X0 = new nzu(i2, (byte) 22);
        Y0 = new nzu(i2, (byte) 23);
        Z0 = new nzu(i2, (byte) 24);
        a1 = new nzu(i2, (byte) 25);
        b1 = new nzu(i2, (byte) 26);
        c1 = new nzu(i2, (byte) 27);
        d1 = new nzu(i2, (byte) 28);
        e1 = new nzu(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzu(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
            case 1:
                return new a2v((String) obj, 1);
            case 2:
                return (h2v) obj;
            case 3:
                return Boolean.valueOf(obj instanceof vnb1);
            case 4:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 5:
                return Boolean.valueOf(obj instanceof h2v);
            case 6:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
            case 7:
                return (String) obj;
            case 8:
                return new a2v((String) obj, 1);
            case 9:
                return ((nwl0) obj).e();
            case 10:
                r6h1 r6h1Var = r6h1.c;
                return new zkl0(new yok0((byte) 21));
            case 11:
                x6h1 x6h1VarC = ((zkl0) obj).a.c();
                x6h1VarC.i.add(new a7h1("change_cellular_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = wzu.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 12:
                x6h1 x6h1VarC2 = ((zkl0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 13:
                r6h1 r6h1Var2 = r6h1.c;
                return new ykl0(new yok0((byte) 21));
            case 14:
                x6h1 x6h1VarC3 = ((ykl0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 15:
                x6h1 x6h1VarC4 = ((ykl0) obj).a.c();
                x6h1VarC4.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 16:
                r6h1 r6h1Var3 = r6h1.c;
                return new zkl0(new yok0((byte) 21));
            case 17:
                x6h1 x6h1VarC5 = ((zkl0) obj).a.c();
                x6h1VarC5.i.add(new a7h1("change_cellular_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                String str2 = wzu.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 18:
                x6h1 x6h1VarC6 = ((zkl0) obj).a.c();
                x6h1VarC6.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            case 19:
                r6h1 r6h1Var4 = r6h1.c;
                return new ykl0(new yok0((byte) 21));
            case 20:
                x6h1 x6h1VarC7 = ((ykl0) obj).a.c();
                x6h1VarC7.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                x6h1 x6h1VarC8 = ((ykl0) obj).a.c();
                x6h1VarC8.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
            case 22:
                return ((vaz) obj).a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return rih1.a;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return Boolean.FALSE;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                rer0 rer0Var = (rer0) obj;
                return new uv11(rer0Var.a, rer0Var.b, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 26:
                return Boolean.FALSE;
            case 27:
                rer0 rer0Var2 = (rer0) obj;
                return new uv11(rer0Var2.a, rer0Var2.b, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 28:
                return Collections.singleton(((rer0) obj).a);
            default:
                return Collections.singleton(((rer0) obj).a);
        }
    }
}
