package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.d;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.o;
import j$.nio.file.g0;
import j$.nio.file.h;
import j$.nio.file.r;
import j$.nio.file.v;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class c {
    public static final Set a = g.p(new Object[]{g0.CREATE, g0.TRUNCATE_EXISTING, g0.WRITE});

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, j$.nio.file.a... aVarArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, k... kVarArr);

    public void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    public void e(Path path, Path path2, k... kVarArr) {
        throw new UnsupportedOperationException();
    }

    public abstract void f(Path path);

    public boolean g(Path path) {
        return path.toFile().delete();
    }

    public o h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == d.class) {
            return (o) cls.cast(new j$.desugar.sun.nio.fs.b(path));
        }
        return null;
    }

    public j$.nio.file.d i(Path path) {
        throw new SecurityException("getFileStore");
    }

    public abstract h j(URI uri);

    public abstract Path k(URI uri);

    public String l() {
        return "file";
    }

    public boolean m(Path path) {
        return path.toFile().isHidden();
    }

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, k... kVarArr) {
        throw new UnsupportedOperationException();
    }

    public abstract SeekableByteChannel q(Path path, Set set, k... kVarArr);

    public abstract DirectoryStream r(Path path, DirectoryStream.Filter filter);

    public abstract FileChannel s(Path path, Set set, k... kVarArr);

    public h t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract h u(URI uri, Map map);

    public InputStream v(Path path, v... vVarArr) {
        Set hashSet;
        if (vVarArr.length > 0) {
            for (v vVar : vVarArr) {
                if (vVar == g0.APPEND || vVar == g0.WRITE) {
                    r.e("'", vVar, "' not allowed");
                    return null;
                }
            }
        }
        int i = Files.a;
        if (vVarArr.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet();
            Collections.addAll(hashSet, vVarArr);
        }
        return Channels.newInputStream(Files.c(path).q(path, hashSet, new k[0]));
    }

    public OutputStream w(Path path, v... vVarArr) {
        Set set;
        if (vVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (v vVar : vVarArr) {
                if (vVar == g0.READ) {
                    r.a("READ not allowed");
                    return null;
                }
                hashSet.add(vVar);
            }
            hashSet.add(g0.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new k[0]));
    }

    public abstract BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr);

    public Map y(Path path, String str, LinkOption... linkOptionArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                r.e("Requested attribute type for: ", strSubstring, " is not available.");
                return null;
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        j$.desugar.sun.nio.fs.b bVar = new j$.desugar.sun.nio.fs.b(path);
        Set set = j$.desugar.sun.nio.fs.b.b;
        j$.desugar.sun.nio.fs.a aVar = new j$.desugar.sun.nio.fs.a();
        aVar.a = new HashSet();
        aVar.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) aVar.a).add(str2);
            }
        }
        BasicFileAttributes attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a("size", Long.valueOf(((j$.desugar.sun.nio.fs.c) attributes).h));
        }
        if (aVar.b("creationTime")) {
            aVar.a("creationTime", ((j$.desugar.sun.nio.fs.c) attributes).c);
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a("lastAccessTime", ((j$.desugar.sun.nio.fs.c) attributes).b);
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a("lastModifiedTime", ((j$.desugar.sun.nio.fs.c) attributes).a);
        }
        if (aVar.b("fileKey")) {
            aVar.a("fileKey", ((j$.desugar.sun.nio.fs.c) attributes).i);
        }
        if (aVar.b("isDirectory")) {
            aVar.a("isDirectory", Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).e));
        }
        if (aVar.b("isRegularFile")) {
            aVar.a("isRegularFile", Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).d));
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a("isSymbolicLink", Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).f));
        }
        if (aVar.b("isOther")) {
            aVar.a("isOther", Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).g));
        }
        return Collections.unmodifiableMap(aVar.b);
    }

    public abstract Path z(Path path);
}
