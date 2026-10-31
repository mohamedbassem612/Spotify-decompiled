package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m9r0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m9r0(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = bpb1Var.collect(new s4q0(vr20Var, (n9r0) obj, (byte) 3), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((p90) bpb1Var).collect(new f740(vr20Var, (s640) obj, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((m9r0) bpb1Var).collect(new f740(vr20Var, (s640) obj, (byte) 2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = bpb1Var.collect(new xhr0((byte) 7, (eyr0) obj, vr20Var), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((ezc) bpb1Var).collect(new xhr0((byte) 9, (o1s0) obj, vr20Var), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((ezc) bpb1Var).collect(new s4q0(vr20Var, (vss0) obj, (byte) 6), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((ezc) bpb1Var).collect(new xhr0((byte) 27, (its0) obj, vr20Var), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((evz) bpb1Var).collect(new s4q0(vr20Var, (mot0) obj, (byte) 10), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((jge) bpb1Var).collect(new nw9(vr20Var, (Set) obj, (byte) 19), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((uop0) bpb1Var).collect(new nw9(vr20Var, (Set) obj, (byte) 20), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((jge) bpb1Var).collect(new s4q0(vr20Var, (jxt0) obj, (byte) 11), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = bpb1Var.collect(new s4q0(vr20Var, (c8u0) obj, (byte) 14), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ((jge) bpb1Var).collect(new s4q0(vr20Var, (uvg1) obj, (byte) 15), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = bpb1Var.collect(new s4q0(vr20Var, (odu0) obj, (byte) 16), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = bpb1Var.collect(new qz7(vr20Var, (yqg) obj, (byte) 2), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = bpb1Var.collect(new jx80(vr20Var, (PlayerState) obj, (byte) 2), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = ((ve01) bpb1Var).a.collect(new s4q0(vr20Var, (phi0) obj, (byte) 17), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 17:
                ((ay8) bpb1Var).collect(new s4q0(vr20Var, (jou0) obj, (byte) 18), lnmVar);
                return d9nVar;
            case 18:
                Object objCollect18 = bpb1Var.collect(new v6w(vr20Var, (ArrayList) obj, (byte) 2), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 19:
                Object objCollect19 = ((zob1) bpb1Var).collect(new buc0(vr20Var, (String) obj, (byte) 21), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case 20:
                Object objCollect20 = bpb1Var.collect(new dfu0((byte) 19, (m9v0) obj, vr20Var), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect21 = ((any) bpb1Var).collect(new dfu0((byte) 20, (ce3) obj, vr20Var), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 22:
                Object objCollect22 = bpb1Var.collect(new xfv0(vr20Var, (oei1) obj), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect23 = ((wzv0) bpb1Var).collect(new qkv0((byte) 12, (kjw0) obj, vr20Var), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect24 = ((xe01) bpb1Var).a.collect(new s4q0(vr20Var, (wpw0) obj, (byte) 22), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect25 = bpb1Var.collect(new qkv0((byte) 21, (eqw0) obj, vr20Var), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 26:
                Object objCollect26 = bpb1Var.collect(new p0x0((byte) 0, (vqv0) obj, vr20Var), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 27:
                ((ay8) bpb1Var).collect(new s4q0(vr20Var, (c1x0) obj, (byte) 23), lnmVar);
                return d9nVar;
            case 28:
                bpb1Var.collect(new s4q0(vr20Var, (sdx0) obj, (byte) 24), lnmVar);
                return d9nVar;
            default:
                Object objCollect27 = bpb1Var.collect(new s4q0(vr20Var, (tzr0) obj, (byte) 26), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
        }
    }
}
