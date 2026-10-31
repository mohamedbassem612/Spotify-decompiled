package com.spotify.devicelocation.consent;

import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/spotify/devicelocation/consent/ConsentDataLoaderError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "Unknown", "BackendError", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$BackendError;", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$Unknown;", "src_main_java_com_spotify_devicelocation_consent-consent"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ConsentDataLoaderError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$BackendError;", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError;", "src_main_java_com_spotify_devicelocation_consent-consent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackendError extends ConsentDataLoaderError {
        public final int a;
        public final String b;

        public BackendError(int i, String str) {
            super(0);
            this.a = i;
            this.b = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackendError)) {
                return false;
            }
            BackendError backendError = (BackendError) obj;
            return this.a == backendError.a && u890.j(this.b, backendError.b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$Unknown;", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError;", "<init>", "()V", "src_main_java_com_spotify_devicelocation_consent-consent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends ConsentDataLoaderError {
        public static final Unknown a = new Unknown();

        private Unknown() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 538219331;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ ConsentDataLoaderError(int i) {
        this();
    }

    private ConsentDataLoaderError() {
    }
}
