package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class mu5 extends cv5 {
    public static final lu5 Companion = new lu5();
    public Integer b;
    public Integer c;
    public Integer d;

    public mu5(PlayerState playerState, yqg yqgVar) {
        spq0 spq0VarDuration;
        Long l;
        Long l2;
        spq0 spq0VarDuration2;
        Long l3;
        spq0 spq0VarPosition;
        Long l4;
        int i = 0;
        Integer numValueOf = Integer.valueOf((playerState == null || (spq0VarPosition = playerState.position(yqgVar.b())) == null || (l4 = (Long) spq0VarPosition.e(0L)) == null) ? 0 : (int) l4.longValue());
        Integer numValueOf2 = Integer.valueOf((playerState == null || (spq0VarDuration2 = playerState.duration()) == null || (l3 = (Long) spq0VarDuration2.e(0L)) == null) ? 0 : (int) l3.longValue());
        if (playerState != null && (spq0VarDuration = playerState.duration()) != null && (l = (Long) spq0VarDuration.e(0L)) != null) {
            int iLongValue = (int) l.longValue();
            spq0 spq0VarPosition2 = playerState.position(yqgVar.b());
            int iLongValue2 = (spq0VarPosition2 == null || (l2 = (Long) spq0VarPosition2.e(0L)) == null) ? 0 : (int) l2.longValue();
            if (iLongValue > 0) {
                i = (iLongValue2 * 100) / iLongValue;
            }
        }
        Integer numValueOf3 = Integer.valueOf(i);
        this.b = numValueOf;
        this.c = numValueOf2;
        this.d = numValueOf3;
    }
}
