package p;

import j$.nio.file.FileVisitResult;
import j$.nio.file.SimpleFileVisitor;
import j$.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o420 extends SimpleFileVisitor {
    public final /* synthetic */ AtomicLong a;

    public o420(AtomicLong atomicLong) {
        this.a = atomicLong;
    }

    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        this.a.addAndGet(basicFileAttributes.size());
        return FileVisitResult.CONTINUE;
    }
}
