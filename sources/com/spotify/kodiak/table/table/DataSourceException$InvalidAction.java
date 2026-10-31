package com.spotify.kodiak.table.table;

import kotlin.Metadata;
import p.jh5;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException$InvalidAction;", "Lcom/spotify/kodiak/table/table/DataSourceException;", "src_main_java_com_spotify_kodiak_table-table"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DataSourceException$InvalidAction extends DataSourceException {
    public final jh5 a;
    public final Object b;

    public DataSourceException$InvalidAction(jh5 jh5Var, Object obj) {
        super(null);
        this.a = jh5Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataSourceException$InvalidAction)) {
            return false;
        }
        DataSourceException$InvalidAction dataSourceException$InvalidAction = (DataSourceException$InvalidAction) obj;
        return u890.j(this.a, dataSourceException$InvalidAction.a) && u890.j(this.b, dataSourceException$InvalidAction.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.c * 31);
    }
}
