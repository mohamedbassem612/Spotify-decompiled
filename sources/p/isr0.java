package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class isr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isr0(Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                return rih1Var;
            case 1:
                function0.invoke();
                return rih1Var;
            case 2:
                function0.invoke();
                return rih1Var;
            case 3:
                function0.invoke();
                return rih1Var;
            case 4:
                function0.invoke();
                return rih1Var;
            case 5:
                function0.invoke();
                return rih1Var;
            case 6:
                function0.invoke();
                return rih1Var;
            case 7:
                function0.invoke();
                return rih1Var;
            case 8:
                function0.invoke();
                return rih1Var;
            case 9:
                function0.invoke();
                return rih1Var;
            case 10:
                function0.invoke();
                return rih1Var;
            case 11:
                function0.invoke();
                return rih1Var;
            case 12:
                function0.invoke();
                return rih1Var;
            case 13:
                function0.invoke();
                return rih1Var;
            case 14:
                function0.invoke();
                return rih1Var;
            case 15:
                function0.invoke();
                return rih1Var;
            case 16:
                function0.invoke();
                return rih1Var;
            case 17:
                function0.invoke();
                return rih1Var;
            case 18:
                function0.invoke();
                return rih1Var;
            case 19:
                function0.invoke();
                return rih1Var;
            case 20:
                function0.invoke();
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (wpw) function0.invoke();
            case 22:
                return (wpw) function0.invoke();
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return (wpw) function0.invoke();
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return (wpw) function0.invoke();
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                function0.invoke();
                return rih1Var;
            case 26:
                function0.invoke();
                return rih1Var;
            case 27:
                File file = (File) function0.invoke();
                if (y520.F(file).equals("preferences_pb")) {
                    return file;
                }
                jah.h("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
                return null;
            case 28:
                function0.invoke();
                return rih1Var;
            default:
                function0.invoke();
                return rih1Var;
        }
    }
}
