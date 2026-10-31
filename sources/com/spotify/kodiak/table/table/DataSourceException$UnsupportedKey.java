package com.spotify.kodiak.table.table;

import kotlin.Metadata;
import p.f46;
import p.jh5;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException$UnsupportedKey;", "Lcom/spotify/kodiak/table/table/DataSourceException;", "src_main_java_com_spotify_kodiak_table-table"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DataSourceException$UnsupportedKey extends DataSourceException {
    public final jh5 a;

    /* JADX WARN: Multi-variable type inference failed */
    public DataSourceException$UnsupportedKey(jh5 jh5Var) {
        super("Unsupported Kodiak key: " + jh5Var);
        this.a = jh5Var;
        setStackTrace((StackTraceElement[]) f46.A0(new StackTraceElement[]{new StackTraceElement(jh5Var.a.a().getName(), "unsupportedKodiakKey", null, -1)}, getStackTrace()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataSourceException$UnsupportedKey) && u890.j(this.a, ((DataSourceException$UnsupportedKey) obj).a);
    }

    public final int hashCode() {
        return this.a.c;
    }
}
