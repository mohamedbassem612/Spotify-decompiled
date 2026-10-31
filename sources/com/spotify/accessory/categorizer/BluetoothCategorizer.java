package com.spotify.accessory.categorizer;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import p.lnm;
import p.m210;
import p.mr20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/spotify/accessory/categorizer/BluetoothCategorizer;", "", "Lp/rih1;", "stop", "()V", "Lp/m210;", "description", "Lp/mr20;", "Lcom/spotify/accessory/categorizer/CategorizerResponse;", "categorizeAndUpdateCaches", "(Lp/m210;)Lp/mr20;", "", "deviceName", "(Ljava/lang/String;)Lp/mr20;", "categorize", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_accessory_categorizer-categorizer"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public interface BluetoothCategorizer {
    Object categorize(String str, lnm<? super CategorizerResponse> lnmVar);

    mr20 categorizeAndUpdateCaches(String deviceName);

    mr20 categorizeAndUpdateCaches(m210 description);

    void stop();
}
