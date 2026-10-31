package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface HttpCacheBoundaryInterface {
    long getDefaultQuotaBytes();

    long getQuotaBytes();

    boolean isUsingDefaultQuota();

    void setQuotaBytes(long j);

    void useDefaultQuota();
}
