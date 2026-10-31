package p;

import android.os.Environment;
import com.spotify.base.java.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pjm1 {
    public static final List c;
    public static final Pattern d = Pattern.compile("\\S+ (\\S+) (\\S+) rw.*");
    public static final Set e;
    public final hn60 a;
    public final String b;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile("^/cache.*"));
        arrayList.add(Pattern.compile("^/config.*"));
        arrayList.add(Pattern.compile("^/dev/.*"));
        arrayList.add(Pattern.compile("^/firmware.*"));
        arrayList.add(Pattern.compile("^/persist.*"));
        arrayList.add(Pattern.compile("^/storage/emulated/legacy.*"));
        arrayList.add(Pattern.compile("^/storage/emulated/[0-9]+/Android/obb"));
        arrayList.add(Pattern.compile("^/sys/.*"));
        arrayList.add(Pattern.compile("^/data/user_de.*"));
        arrayList.add(Pattern.compile("^/data/data.*"));
        c = Collections.unmodifiableList(arrayList);
        HashSet hashSet = new HashSet();
        hashSet.add("tmpfs");
        hashSet.add("rootfs");
        hashSet.add("proc");
        hashSet.add("procfs");
        hashSet.add("selinuxfs");
        hashSet.add("sockfs");
        hashSet.add("sysfs");
        hashSet.add("cgroup");
        hashSet.add("cifs");
        hashSet.add("nfs");
        hashSet.add("smbfs");
        hashSet.add("configfs");
        hashSet.add("functionfs");
        e = Collections.unmodifiableSet(hashSet);
    }

    public pjm1(ajg ajgVar, f5u f5uVar, hn60 hn60Var) {
        this.a = hn60Var;
        this.b = f4i1.f("Android/data/", ((zym0) ajgVar).a, "/files");
    }

    public static LinkedHashSet b(m420 m420Var) throws Throwable {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(m420Var, "ascii"));
            try {
                Iterator it = z561.R(new hjc0(bufferedReader2)).iterator();
                while (it.hasNext()) {
                    Matcher matcher = d.matcher((String) it.next());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        if (strGroup != null && strGroup2 != null && !e.contains(strGroup2)) {
                            linkedHashSet.add(strGroup);
                        }
                    }
                }
                uh70.a(bufferedReader2);
                return linkedHashSet;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                uh70.a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Set a() {
        ArrayList arrayList;
        Iterator it;
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m420 m420VarA = null;
        try {
            m420VarA = this.a.a();
            linkedHashSet.addAll(b(m420VarA));
            m420VarA.close();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.b;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                File file = new File((String) next, str);
                boolean zMkdirs = file.mkdirs();
                boolean z = file.exists() || zMkdirs;
                if (zMkdirs && !file.delete()) {
                    Logger.k("Could not delete the probe folder: %s", file.getAbsolutePath());
                }
                if (z) {
                    arrayList.add(next);
                }
            }
        } catch (IOException unused) {
            uh70.a(m420VarA);
            Logger.k("Cannot get regular mount points", new Object[0]);
            linkedHashSet.clear();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : linkedHashSet) {
            String str2 = (String) obj;
            Iterator it2 = c.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList2.add(obj);
                    break;
                }
            } while (!((Pattern) it2.next()).matcher(str2).matches());
        }
        Set setO1 = o7h.o1(arrayList2);
        setO1.add(Environment.getExternalStorageDirectory().getAbsolutePath());
        arrayList = new ArrayList();
        it = setO1.iterator();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            String str3 = (String) obj2;
            if (f5u.a(new File(str3)).a || f5u.a(new File(str3, str)).a) {
                arrayList3.add(obj2);
            } else {
                Logger.k("Cannot write to mount point %s", str3);
            }
        }
        return o7h.p1(arrayList3);
    }
}
