package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vvu implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ay8 b;

    public /* synthetic */ vvu(ay8 ay8Var, byte b) {
        this.a = b;
        this.b = ay8Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 2;
        d9n d9nVar = d9n.a;
        ay8 ay8Var = this.b;
        switch (b) {
            case 0:
                ay8Var.collect(new inu(vr20Var, (byte) 12), lnmVar);
                break;
            case 1:
                ay8Var.collect(new inu(vr20Var, (byte) 13), lnmVar);
                break;
            case 2:
                ay8Var.collect(new inu(vr20Var, (byte) 20), lnmVar);
                break;
            case 3:
                ay8Var.collect(new inu(vr20Var, (byte) 21), lnmVar);
                break;
            case 4:
                ay8Var.collect(new inu(vr20Var, (byte) 23), lnmVar);
                break;
            case 5:
                ay8Var.collect(new inu(vr20Var, (byte) 24), lnmVar);
                break;
            case 6:
                ay8Var.collect(new fwv(vr20Var, (byte) 12), lnmVar);
                break;
            case 7:
                ay8Var.collect(new fwv(vr20Var, (byte) 13), lnmVar);
                break;
            case 8:
                ay8Var.collect(new fwv(vr20Var, (byte) 14), lnmVar);
                break;
            case 9:
                ay8Var.collect(new fwv(vr20Var, (byte) 15), lnmVar);
                break;
            case 10:
                ay8Var.collect(new w0x(vr20Var, (byte) 15), lnmVar);
                break;
            case 11:
                ay8Var.collect(new w0x(vr20Var, (byte) 21), lnmVar);
                break;
            case 12:
                ay8Var.collect(new w0x(vr20Var, (byte) 25), lnmVar);
                break;
            case 13:
                ay8Var.collect(new w0x(vr20Var, (byte) 26), lnmVar);
                break;
            case 14:
                ay8Var.collect(new w0x(vr20Var, (byte) 28), lnmVar);
                break;
            case 15:
                ay8Var.collect(new w0x(vr20Var, (byte) 29), lnmVar);
                break;
            case 16:
                ay8Var.collect(new l6z(vr20Var, (byte) 0), lnmVar);
                break;
            case 17:
                ay8Var.collect(new l6z(vr20Var, (byte) 2), lnmVar);
                break;
            case 18:
                ay8Var.collect(new l6z(vr20Var, (byte) 28), lnmVar);
                break;
            case 19:
                ay8Var.collect(new o010(vr20Var, (byte) 7), lnmVar);
                break;
            case 20:
                ay8Var.collect(new uk50(vr20Var, (byte) 10), lnmVar);
                break;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                ay8Var.collect(new cg90(vr20Var, b2), lnmVar);
                break;
            case 22:
                ay8Var.collect(new w0b0(vr20Var, (byte) 19), lnmVar);
                break;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                ay8Var.collect(new w0b0(vr20Var, (byte) 20), lnmVar);
                break;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                ay8Var.collect(new xnc0(vr20Var, (byte) 7), lnmVar);
                break;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                ay8Var.collect(new xnc0(vr20Var, (byte) 16), lnmVar);
                break;
            case 26:
                ay8Var.collect(new xnc0(vr20Var, (byte) 17), lnmVar);
                break;
            case 27:
                ay8Var.collect(new xnc0(vr20Var, (byte) 18), lnmVar);
                break;
            case 28:
                ay8Var.collect(new xnc0(vr20Var, (byte) 19), lnmVar);
                break;
            default:
                ay8Var.collect(new xnc0(vr20Var, (byte) 20), lnmVar);
                break;
        }
        return d9nVar;
    }
}
