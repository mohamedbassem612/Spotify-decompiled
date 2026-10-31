package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class nj00 {
    static {
        dm61.z0(pkg.a, pkg.b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    public static final ArrayList a(List list) {
        qkg qkgVar;
        List<bq10> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (bq10 bq10Var : list2) {
            switch (bq10Var.a) {
                case "podcasts-following-chip":
                    qkgVar = qkg.PODCASTS_FOLLOWING;
                    break;
                case "video-chip":
                    qkgVar = qkg.VIDEO;
                    break;
                case "music-chip":
                    qkgVar = qkg.MUSIC;
                    break;
                case "audiobooks-chip":
                    qkgVar = qkg.AUDIOBOOKS;
                    break;
                case "podcasts-chip":
                    qkgVar = qkg.PODCASTS;
                    break;
                case "wrapped-chip":
                    qkgVar = qkg.WRAPPED;
                    break;
                case "default":
                    qkgVar = qkg.DEFAULT;
                    break;
                case "music-following-chip":
                    qkgVar = qkg.MUSIC_FOLLOWING;
                    break;
                default:
                    qkgVar = null;
                    break;
            }
            if (qkgVar != null) {
                String str = bq10Var.b;
                List list3 = bq10Var.d;
                bq10Var = new bq10(qkgVar.a, str, qkgVar.b, a(list3), bq10Var.e, bq10Var.f, bq10Var.g);
            }
            arrayList.add(bq10Var);
        }
        return arrayList;
    }
}
