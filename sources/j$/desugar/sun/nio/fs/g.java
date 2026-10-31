package j$.desugar.sun.nio.fs;

import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.FileTime;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.g0;
import j$.nio.file.i0;
import j$.nio.file.j0;
import j$.nio.file.k0;
import j$.nio.file.l0;
import j$.nio.file.t;
import j$.nio.file.x;
import j$.nio.file.y;
import java.nio.file.CopyOption;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class g {
    public static String a(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String b(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static FileTime c(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return new FileTime(fileTime.toMillis());
    }

    public static /* synthetic */ StandardOpenOption d(g0 g0Var) {
        if (g0Var == g0.READ) {
            return StandardOpenOption.READ;
        }
        if (g0Var == g0.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (g0Var == g0.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (g0Var == g0.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (g0Var == g0.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (g0Var == g0.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (g0Var == g0.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (g0Var == g0.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return g0Var == g0.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static java.nio.file.attribute.FileTime e(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    public static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return y.p((Path) obj);
        }
        return obj instanceof java.nio.file.Path ? x.p((java.nio.file.Path) obj) : obj;
    }

    public static Class g(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return j$.nio.file.attribute.d.class;
        }
        if (cls == j$.nio.file.attribute.d.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return u.class;
        }
        if (cls == u.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return r.class;
        }
        if (cls == r.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == j$.nio.file.attribute.g.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return j$.nio.file.attribute.g.class;
        }
        if (cls == j$.nio.file.attribute.x.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return j$.nio.file.attribute.x.class;
        }
        if (cls == j$.nio.file.attribute.a.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return j$.nio.file.attribute.a.class;
        }
        j$.util.a.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return v.class;
        }
        if (cls == v.class) {
            return PosixFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.h.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return j$.nio.file.attribute.h.class;
        }
        j$.util.a.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map i(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, j(map.get(str)));
        }
        return map2;
    }

    public static Object j(Object obj) {
        if (obj instanceof java.nio.file.attribute.FileTime) {
            try {
                return c((java.nio.file.attribute.FileTime) obj);
            } catch (ClassCastException e) {
                j$.util.a.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof FileTime)) {
            return obj;
        }
        try {
            return e((FileTime) obj);
        } catch (ClassCastException e2) {
            j$.util.a.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set k(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.v) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(j$.nio.file.u.a((j$.nio.file.v) it.next()));
                } catch (ClassCastException e) {
                    j$.util.a.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                j$.util.a.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(t.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    j$.util.a.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set l(Set set) {
        w wVar;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof w) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    w wVar2 = (w) it.next();
                    if (wVar2 == null) {
                        posixFilePermission = null;
                    } else if (wVar2 == w.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (wVar2 == w.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (wVar2 == w.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (wVar2 == w.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (wVar2 == w.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (wVar2 == w.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (wVar2 == w.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = wVar2 == w.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    j$.util.a.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                j$.util.a.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        wVar = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        wVar = w.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        wVar = w.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        wVar = w.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        wVar = w.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        wVar = w.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        wVar = w.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        wVar = w.OTHERS_READ;
                    } else {
                        wVar = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? w.OTHERS_WRITE : w.OTHERS_EXECUTE;
                    }
                    hashSet.add(wVar);
                } catch (ClassCastException e2) {
                    j$.util.a.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static boolean m(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof w) || (next instanceof PosixFilePermission);
    }

    public static /* synthetic */ String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ List o(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Set p(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ LinkOption[] q(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static l0[] r(WatchEvent.Kind[] kindArr) {
        l0 j0Var;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        l0[] l0VarArr = new l0[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                j0Var = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                j0Var = i0.b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                j0Var = i0.c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                j0Var = i0.d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                j0Var = i0.a;
            } else {
                j0Var = kind instanceof k0 ? ((k0) kind).a : new j0(kind);
            }
            l0VarArr[i] = j0Var;
        }
        return l0VarArr;
    }

    public static j$.nio.file.attribute.k[] s(FileAttribute[] fileAttributeArr) {
        j$.nio.file.attribute.k iVar;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        j$.nio.file.attribute.k[] kVarArr = new j$.nio.file.attribute.k[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                iVar = null;
            } else if (m(fileAttribute.value())) {
                iVar = new h(fileAttribute);
            } else {
                iVar = fileAttribute instanceof j$.nio.file.attribute.j ? ((j$.nio.file.attribute.j) fileAttribute).a : new j$.nio.file.attribute.i(fileAttribute);
            }
            kVarArr[i] = iVar;
        }
        return kVarArr;
    }

    public static /* synthetic */ CopyOption[] t(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption cVar;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                cVar = null;
            } else if (copyOption instanceof j$.nio.file.b) {
                cVar = ((j$.nio.file.b) copyOption).a;
            } else if (copyOption instanceof LinkOption) {
                cVar = java.nio.file.LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof StandardCopyOption) {
                StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
                cVar = standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            } else {
                cVar = new j$.nio.file.c(copyOption);
            }
            copyOptionArr2[i] = cVar;
        }
        return copyOptionArr2;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] u(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static WatchEvent.Kind[] v(l0[] l0VarArr) {
        WatchEvent.Kind k0Var;
        if (l0VarArr == null) {
            return null;
        }
        int length = l0VarArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            l0 l0Var = l0VarArr[i];
            if (l0Var == null) {
                k0Var = null;
            } else if (l0Var == i0.b) {
                k0Var = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (l0Var == i0.c) {
                k0Var = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (l0Var == i0.d) {
                k0Var = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (l0Var == i0.a) {
                k0Var = StandardWatchEventKinds.OVERFLOW;
            } else {
                k0Var = l0Var instanceof j0 ? ((j0) l0Var).a : new k0(l0Var);
            }
            kindArr[i] = k0Var;
        }
        return kindArr;
    }

    public static FileAttribute[] w(j$.nio.file.attribute.k[] kVarArr) {
        FileAttribute jVar;
        if (kVarArr == null) {
            return null;
        }
        int length = kVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.attribute.k kVar = kVarArr[i];
            if (kVar == null) {
                jVar = null;
            } else if (m(kVar.value())) {
                jVar = new j$.nio.file.attribute.l(kVar);
            } else {
                jVar = kVar instanceof j$.nio.file.attribute.i ? ((j$.nio.file.attribute.i) kVar).a : new j$.nio.file.attribute.j(kVar);
            }
            fileAttributeArr[i] = jVar;
        }
        return fileAttributeArr;
    }

    public static char x(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }
}
