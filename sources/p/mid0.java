package p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class mid0 {

    /* JADX INFO: Fake field, exist only in values array */
    mid0 EF5;
    public static final /* synthetic */ mid0[] b = {new mid0("UNKNOWN", 0), new mid0(SearchEndpointResponseKt.RESULT_SUCCESS, 1), new mid0("MISSING_INFORMATION", 2)};
    public static final lid0 Companion = new lid0();
    public static final znb0 a = dm5.S(2, fnc0.U0);

    public static mid0 valueOf(String str) {
        return (mid0) Enum.valueOf(mid0.class, str);
    }

    public static mid0[] values() {
        return (mid0[]) b.clone();
    }
}
