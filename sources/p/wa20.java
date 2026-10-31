package p;

import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase_Impl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wa20 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FilterMetadataDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa20(FilterMetadataDatabase_Impl filterMetadataDatabase_Impl, byte b) {
        super(0);
        this.a = b;
        this.b = filterMetadataDatabase_Impl;
    }

    public final Object invoke() {
        byte b = this.a;
        FilterMetadataDatabase_Impl filterMetadataDatabase_Impl = this.b;
        switch (b) {
            case 0:
                return new ab10(filterMetadataDatabase_Impl);
            case 1:
                return new gb10(filterMetadataDatabase_Impl);
            default:
                return new ooa1(filterMetadataDatabase_Impl);
        }
    }
}
