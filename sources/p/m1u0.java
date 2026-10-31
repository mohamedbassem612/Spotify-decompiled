package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m1u0 {
    public static final Set e;
    public static final LinkedHashSet f;
    public final Context a;
    public final m961 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        Set setS0 = f46.S0(new String[]{"com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_ADD_TO_COLLECTION", "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION", "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_BAN", "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_UNBAN"});
        e = setS0;
        f = dm61.y0(setS0, f46.S0(new String[]{"com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV", "com.spotify.playbacknotifications.playbacknotifications.PAUSE", "com.spotify.playbacknotifications.playbacknotifications.RESUME", "com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC", "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC", "com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT", "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_SHUTDOWN"}));
    }

    public m1u0(Context context, m961 m961Var) {
        this.a = context;
        this.b = m961Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final PendingIntent a(String str, int i, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        this.b.getClass();
        Context context = this.a;
        Intent intentA = m961.a(context, str);
        switch (str.hashCode()) {
            case -1755005516:
                if (str.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC")) {
                    string = bundle.getString("mode");
                    if (string != null) {
                        intentA.putExtra("mode", string);
                    }
                }
                break;
            case -1505412510:
                if (str.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION")) {
                    string2 = bundle.getString("mode");
                    if (string2 != null) {
                        intentA.putExtra("mode", string2);
                    }
                    string3 = bundle.getString("uri");
                    if (string3 != null) {
                        intentA.putExtra("uri", string3);
                    }
                    string4 = bundle.getString("context_source");
                    if (string4 != null) {
                        intentA.putExtra("context_source", string4);
                    }
                }
                break;
            case -972203213:
                if (str.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                    string = bundle.getString("mode");
                    if (string != null) {
                        intentA.putExtra("mode", string);
                    }
                }
                break;
            case -12633488:
                if (str.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                    string = bundle.getString("mode");
                    if (string != null) {
                        intentA.putExtra("mode", string);
                    }
                }
                break;
            case 704335770:
                if (str.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_ADD_TO_COLLECTION")) {
                    string2 = bundle.getString("mode");
                    if (string2 != null) {
                        intentA.putExtra("mode", string2);
                    }
                    string3 = bundle.getString("uri");
                    if (string3 != null) {
                        intentA.putExtra("uri", string3);
                    }
                    string4 = bundle.getString("context_source");
                    if (string4 != null) {
                        intentA.putExtra("context_source", string4);
                    }
                }
                break;
            case 1241066640:
                if (str.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                    string = bundle.getString("mode");
                    if (string != null) {
                        intentA.putExtra("mode", string);
                    }
                }
                break;
            case 1241138128:
                if (str.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                    string = bundle.getString("mode");
                    if (string != null) {
                        intentA.putExtra("mode", string);
                    }
                }
                break;
            case 1646813797:
                if (str.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_BAN")) {
                    string2 = bundle.getString("mode");
                    if (string2 != null) {
                        intentA.putExtra("mode", string2);
                    }
                    string3 = bundle.getString("uri");
                    if (string3 != null) {
                        intentA.putExtra("uri", string3);
                    }
                    string4 = bundle.getString("context_source");
                    if (string4 != null) {
                        intentA.putExtra("context_source", string4);
                    }
                }
                break;
            case 1859828010:
                if (str.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                    string = bundle.getString("mode");
                    if (string != null) {
                        intentA.putExtra("mode", string);
                    }
                }
                break;
            case 2058018732:
                if (str.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_UNBAN")) {
                    string2 = bundle.getString("mode");
                    if (string2 != null) {
                        intentA.putExtra("mode", string2);
                    }
                    string3 = bundle.getString("uri");
                    if (string3 != null) {
                        intentA.putExtra("uri", string3);
                    }
                    string4 = bundle.getString("context_source");
                    if (string4 != null) {
                        intentA.putExtra("context_source", string4);
                    }
                }
                break;
        }
        return PendingIntent.getBroadcast(context, i, intentA, 201326592);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final PendingIntent b(Bundle bundle, String str) {
        k1u0 k1u0Var;
        switch (str) {
            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION":
            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_ADD_TO_COLLECTION":
            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_BAN":
            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_UNBAN":
                k1u0Var = new k1u0(bundle.getString("mode"), bundle.getString("uri"), bundle.getString("context_source"));
                break;
            default:
                k1u0Var = new k1u0(bundle.getString("mode"), null, null);
                break;
        }
        Object objCompute = this.c.compute(str, new l1u0(k1u0Var, this, str, bundle));
        objCompute.getClass();
        return ((j1u0) objCompute).b;
    }

    public final void c() {
        Bundle bundleG = cy30.g("mode", "pending_intent_fallback");
        for (String str : f) {
            ConcurrentHashMap concurrentHashMap = this.d;
            if (!concurrentHashMap.containsKey(str)) {
                try {
                    concurrentHashMap.put(str, a(str, str.hashCode() + 1, bundleG));
                } catch (SecurityException e2) {
                    Logger.b("Could not prime fallback intent for %s (%s)", new Object[]{str, e2.getMessage()});
                }
            }
        }
    }
}
