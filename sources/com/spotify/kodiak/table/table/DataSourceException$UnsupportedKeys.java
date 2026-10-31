package com.spotify.kodiak.table.table;

import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException$UnsupportedKeys;", "Lcom/spotify/kodiak/table/table/DataSourceException;", "src_main_java_com_spotify_kodiak_table-table"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DataSourceException$UnsupportedKeys extends DataSourceException {
    public final LinkedHashSet a;

    public DataSourceException$UnsupportedKeys(LinkedHashSet linkedHashSet) {
        super(null);
        this.a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataSourceException$UnsupportedKeys) && this.a.equals(((DataSourceException$UnsupportedKeys) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
