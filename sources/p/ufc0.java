package p;

import android.content.Intent;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeIntentChecker;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeMatcher;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ufc0 implements rq21 {
    public final /* synthetic */ byte a;
    public final List b;

    public ufc0() {
        this.a = (byte) 1;
        this.b = p7h.M(new oq21("Local Files", blc0.LOCAL_FILES_ROOT), new pq21(AudioMimeMatcher.INSTANCE));
    }

    @Override // p.rq21
    public final List a() {
        byte b = this.a;
        return this.b;
    }

    @Override // p.rq21
    public final nq21 b(Intent intent) {
        byte b = this.a;
        mq21 mq21Var = mq21.a;
        switch (b) {
            case 0:
                Set set = s4b1.f;
                String strE = uic.x(intent.getDataString()).E();
                if (strE == null) {
                    strE = "";
                }
                return sto1.m(strE) ? new lq21("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") : mq21Var;
            default:
                return AudioMimeIntentChecker.INSTANCE.isAudioMimeIntent(intent) ? new lq21(nik1.K2.a) : mq21Var;
        }
    }

    public ufc0(jq21 jq21Var, agc0 agc0Var) {
        this.a = (byte) 0;
        this.b = k4p1.x(new oq21("Legacy Collection Tracks", blc0.COLLECTION_TRACKS));
    }
}
