package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dzh extends yf {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dzh(String str, Intent intent, byte b) {
        super(str, intent);
        this.c = b;
    }

    public final String t() {
        switch (this.c) {
            case 0:
                return "Activity";
            case 1:
                return "BroadcastReceiver";
            default:
                return "Service";
        }
    }
}
