package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.f0;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class h implements f0, DirectoryStream.Filter, j$.nio.file.attribute.k, TemporalAccessor {
    public final Object a;

    public /* synthetic */ h(Object obj) {
        this.a = obj;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public boolean accept(Object obj) {
        return ((DirectoryStream.Filter) this.a).accept(g.f(obj));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object d(j$.time.d dVar) {
        return dVar == j$.time.temporal.m.a ? (ZoneId) this.a : super.d(dVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(TemporalField temporalField) {
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long j(TemporalField temporalField) {
        throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.nio.file.f0
    public boolean m(Path path) {
        return ((Pattern) this.a).matcher(path.toString()).matches();
    }

    @Override // j$.nio.file.attribute.k
    public String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.k
    public Object value() {
        return Collections.unmodifiableSet(g.l((Set) ((FileAttribute) this.a).value()));
    }
}
