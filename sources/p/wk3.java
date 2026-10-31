package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wk3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk3(String str, byte b) {
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
                ((qv00) obj).a(str, iam.class, false);
                return rih1Var;
            case 1:
                return str;
            case 2:
                return str;
            case 3:
                return str;
            case 4:
                return str;
            case 5:
                return ((o3m0) obj).a(str);
            case 6:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                b261.n((e261) obj, str);
                return rih1Var;
            case 10:
                return str;
            case 11:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 12:
                ((qv00) obj).a(str, vy6.class, false);
                return rih1Var;
            case 13:
                return ((l2l0) obj).a(str.concat(":dna"));
            case 14:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                ((qv00) obj).a(str, myv0.class, false);
                return rih1Var;
            case 17:
                b261.g((e261) obj, str, (Function0) null);
                return rih1Var;
            case 18:
                ((qv00) obj).a(str, lo7.class, false);
                return rih1Var;
            case 19:
                ((qv00) obj).a(str, sdy.class, false);
                return rih1Var;
            case 20:
                return new ufw0(str, str, new aru0(sqg0.J(new mmr0[]{new mmr0("is_audiobook", AndroidServicebasedrouterProperties$TestHelper.TRUE), new mmr0("autoplay_candidate", AndroidServicebasedrouterProperties$TestHelper.FALSE)}), Collections.singletonMap("is_pre_release", AndroidServicebasedrouterProperties$TestHelper.TRUE), 1));
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                jer0 jer0Var = (jer0) obj;
                return new ib8(jer0Var.a, jer0Var.b, str);
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, jo70.class, false);
                qv00Var.a(str, pnt.class, false);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new p330(str);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new s371(str, (String) null, 10, "AuthorPageHeader");
            case 26:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, jo70.class, false);
                qv00Var2.a(str, xkk1.class, false);
                return rih1Var;
            case 27:
                ((qv00) obj).a(str, bb9.class, false);
                return rih1Var;
            case 28:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                ((qv00) obj).a(str, wuj0.class, false);
                return rih1Var;
        }
    }
}
