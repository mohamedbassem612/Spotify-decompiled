package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vd0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public vd0(qt20 qt20Var, mr20 mr20Var, xu30 xu30Var) {
        this.a = (byte) 20;
        this.c = qt20Var;
        this.b = mr20Var;
        this.d = xu30Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 20;
        byte b3 = 2;
        byte b4 = 0;
        byte b5 = 3;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((mr20) obj3).collect(new ud0(vr20Var, (String) obj2, (ArrayList) obj, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((te1) obj3).collect(new h50((byte) 2, (a42) obj2, (hti0) obj, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((mr20) obj3).collect(new h50((byte) 3, (am1) obj2, (bl3) obj, vr20Var), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((jge) obj3).collect(new h50((byte) 4, (u961) obj2, (PlayerState) obj, vr20Var), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((mr20) obj3).collect(new h50((byte) 5, (ha3) obj2, (iz0) obj, vr20Var), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((mr20) obj3).collect(new vt(vr20Var, (ya3) obj2, (qxc0) obj), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((mr20) obj3).collect(new st(vr20Var, (u961) obj, (String) obj2, (byte) 3), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                mr20[] mr20VarArr = (mr20[]) obj3;
                Object objS = fc11.s(new ua3(mr20VarArr, (byte) 3), lnmVar, vr20Var, new qd0((lnm) null, (rcr0) obj2, (d520) obj, (byte) 2), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case 8:
                ((ay8) obj3).collect(new h50((byte) 7, (p811) obj2, (y0r) obj, vr20Var), lnmVar);
                return d9nVar;
            case 9:
                Object objCollect8 = ((mr20) obj3).collect(new f64((byte) 12, (g23) obj2, (UUID) obj, vr20Var), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 10:
                Object objCollect9 = ((ezc) obj3).collect(new h50((byte) 9, (cl8) obj2, (th61) obj, vr20Var), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 11:
                mr20[] mr20VarArr2 = (mr20[]) obj3;
                Object objS2 = fc11.s(new ua3(mr20VarArr2, (byte) 5), lnmVar, vr20Var, new qd0((lnm) null, (rcr0) obj2, (em0) obj, (byte) 3), mr20VarArr2);
                return objS2 == d9nVar ? objS2 : rih1Var;
            case 12:
                Object objCollect10 = ((mr20) obj3).collect(new st(vr20Var, (yu3) obj, (String) obj2, (byte) 13), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 13:
                Object objCollect11 = ((ik) obj3).collect(new f64(b2, (c21) obj2, (qev) obj, vr20Var), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 14:
                Object objCollect12 = ((mr20) obj3).collect(new ku2(vr20Var, (it8) obj2, (List) obj), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 15:
                Object objCollect13 = ((mr20) obj3).collect(new h50((byte) 13, (cab) obj, (String) obj2, vr20Var), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 16:
                Object objCollect14 = ((mr20) obj3).collect(new h50((byte) 16, (lkd) obj2, (ContextTrack) obj, vr20Var), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 17:
                Object objCollect15 = ((mr20) obj3).collect(new h50((byte) 18, (iaf) obj, (String) obj2, vr20Var), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 18:
                Object objCollect16 = ((mr20) obj3).collect(new h50((byte) 19, (we1) obj2, (qsf) obj, vr20Var), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 19:
                Object objCollect17 = ((x010) obj3).collect(new h50((byte) 20, (we1) obj2, (rsf) obj, vr20Var), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 20:
                Object objS3 = smo1.s(new cch((qt20) obj2, (mr20) obj3, vr20Var, (xu30) obj, (lnm) null), lnmVar);
                return objS3 == d9nVar ? objS3 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect18 = ((mr20) obj3).collect(new h50((byte) 22, (uvy) obj, (String) obj2, vr20Var), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 22:
                ((ay8) obj3).collect(new h50((byte) 25, (krk) obj2, (erk) obj, vr20Var), lnmVar);
                return d9nVar;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect19 = ((wef) obj3).collect(new h50((byte) 27, (List) obj2, (z2h) obj, vr20Var), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                ((ay8) obj3).collect(new h50((byte) 28, (lag) obj2, (gnl) obj, vr20Var), lnmVar);
                return d9nVar;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect20 = ((mr20) obj3).collect(new wem(vr20Var, (cfm) obj2, (jem) obj, b4), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 26:
                Object objCollect21 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj2, obj, (byte) 1), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 27:
                ((ay8) obj3).collect(new wem(vr20Var, (wzn) obj2, (l1o) obj, b3), lnmVar);
                return d9nVar;
            case 28:
                Object objCollect22 = ((plu) obj3).collect(new wem(vr20Var, (l0r) obj2, obj, b5), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            default:
                Object objCollect23 = ((mr20) obj3).collect(new ubr(vr20Var, (String) obj2, (String) obj, (byte) 0), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
        }
    }

    public /* synthetic */ vd0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ vd0(byte b, Object obj, String str, mr20 mr20Var) {
        this.a = b;
        this.b = mr20Var;
        this.d = obj;
        this.c = str;
    }
}
