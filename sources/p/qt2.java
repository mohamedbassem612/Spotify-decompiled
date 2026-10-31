package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qt2 {
    public final Flowable a;
    public final yqg b;

    public qt2(Flowable flowable, yqg yqgVar) {
        this.a = flowable;
        this.b = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        pt2 pt2Var;
        Throwable th;
        TimeZone timeZone;
        long j;
        PlayerState playerState;
        String str;
        String strContextUri;
        if (onmVar instanceof pt2) {
            pt2Var = (pt2) onmVar;
            int i = pt2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt2Var.e = i - Integer.MIN_VALUE;
            } else {
                pt2Var = new pt2(this, onmVar);
            }
        } else {
            pt2Var = new pt2(this, onmVar);
        }
        Object obj = pt2Var.c;
        int i2 = pt2Var.e;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                yqg yqgVar = this.b;
                long jB = yqgVar.b();
                TimeZone timeZoneG = yqgVar.g();
                try {
                    Flowable flowable = this.a;
                    pt2Var.b = timeZoneG;
                    pt2Var.a = jB;
                    pt2Var.e = 1;
                    Object objM = lyg.m(flowable, pt2Var);
                    d9n d9nVar = d9n.a;
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                    obj = objM;
                    timeZone = timeZoneG;
                    j = jB;
                } catch (Throwable th2) {
                    th = th2;
                    timeZone = timeZoneG;
                    j = jB;
                    n57.t("Failed to read latest player state for AgentGatewayUserContext", th);
                    playerState = null;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = pt2Var.a;
                timeZone = pt2Var.b;
                try {
                    hm5.M(obj);
                } catch (Throwable th3) {
                    th = th3;
                    n57.t("Failed to read latest player state for AgentGatewayUserContext", th);
                    playerState = null;
                }
            }
            playerState = (PlayerState) obj;
            if (playerState != null) {
                String strO = o4p1.o(playerState);
                if (ihc1.y0(strO)) {
                    str = null;
                } else {
                    str = strO;
                }
            } else {
                str = null;
            }
            String str2 = (playerState == null || (strContextUri = playerState.contextUri()) == null || ihc1.y0(strContextUri)) ? null : strContextUri;
            Boolean boolM = playerState != null ? yah0.m(playerState.isPaused()) : null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
            simpleDateFormat.setTimeZone(timeZone);
            return new ot2(str, str2, simpleDateFormat.format(new Date(j)), yah0.p((int) (((long) timeZone.getOffset(j)) / 60000)), boolM, 32);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
