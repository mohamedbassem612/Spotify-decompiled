package com.android.installreferrer.api;

import android.content.Context;
import p.hhg1;
import p.nn80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class InstallReferrerClient {

    public static final class Builder {
        private final Context mContext;

        private Builder(Context context) {
            this.mContext = context;
        }

        public InstallReferrerClient build() {
            Context context = this.mContext;
            if (context != null) {
                return new b(context);
            }
            hhg1.n("Please provide a valid Context.");
            return null;
        }

        public /* synthetic */ Builder(Context context, nn80 nn80Var) {
            this(context);
        }
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context, null);
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer();

    public abstract boolean isReady();

    public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);
}
