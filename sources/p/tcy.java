package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tcy {
    public final ov20 a;
    public smc0 b;

    public tcy(ov20 ov20Var) {
        this.a = ov20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        scy scyVar;
        if (onmVar instanceof scy) {
            scyVar = (scy) onmVar;
            int i = scyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scyVar.c = i - Integer.MIN_VALUE;
            } else {
                scyVar = new scy(this, onmVar);
            }
        } else {
            scyVar = new scy(this, onmVar);
        }
        Object objI = scyVar.a;
        int i2 = scyVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            smc0 smc0Var = this.b;
            if (smc0Var != null) {
                return smc0Var;
            }
            ezc ezcVar = this.a.a;
            scyVar.c = 1;
            objI = b5p1.i(ezcVar, scyVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        Map map = (Map) objI;
        boolean zT = y7y0.t("has-podcasts-available", map);
        boolean zX = y7y0.x(map);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(EntityType.Artist);
        smc0VarN.add(EntityType.Song);
        smc0VarN.add(EntityType.Album);
        smc0VarN.add(EntityType.Playlist);
        if (zT) {
            smc0VarN.add(EntityType.Podcast);
            smc0VarN.add(EntityType.Episode);
        }
        if (zX) {
            smc0VarN.add(EntityType.Audiobook);
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        this.b = smc0VarK;
        return smc0VarK;
    }
}
