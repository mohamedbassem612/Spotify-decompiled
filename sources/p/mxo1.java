package p;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mxo1 {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final g2o1 a;

    public mxo1(g2o1 g2o1Var) {
        this.a = g2o1Var;
    }

    public static void b(lpn1 lpn1Var, jpo1 jpo1Var) throws IOException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(lpn1Var.a());
            try {
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new cvo1(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        for (cvo1 cvo1Var : (Set) map.get(str)) {
                            String str2 = cvo1Var.a;
                            if (!map2.containsKey(str2)) {
                                map2.put(str2, cvo1Var);
                            }
                        }
                    }
                }
                jpo1Var.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e) {
                e = e;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        iho1.w(e, e2);
                    }
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            zipFile = null;
        }
    }

    public final HashSet a() throws IOException {
        g2o1 g2o1Var = this.a;
        HashSet<lpn1> hashSetA = g2o1Var.a();
        ArrayList<String> arrayList = new ArrayList();
        File file = new File(g2o1Var.g(), "native-libraries");
        g2o1.e(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        for (String str : arrayList) {
            Iterator it = hashSetA.iterator();
            do {
                if (!it.hasNext()) {
                    File file3 = new File(g2o1Var.g(), "native-libraries");
                    g2o1.e(file3);
                    File fileD = g2o1.d(file3, str);
                    g2o1.e(fileD);
                    g2o1.c(fileD);
                    break;
                }
            } while (!((lpn1) it.next()).b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (lpn1 lpn1Var : hashSetA) {
            HashSet hashSet2 = new HashSet();
            b(lpn1Var, new fqn1(this, hashSet2, lpn1Var, (byte) 5));
            String strB = lpn1Var.b();
            HashSet<File> hashSet3 = new HashSet();
            File file4 = new File(g2o1Var.g(), "native-libraries");
            g2o1.e(file4);
            File fileD2 = g2o1.d(file4, strB);
            g2o1.e(fileD2);
            File[] fileArrListFiles2 = fileD2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            for (File file6 : hashSet3) {
                if (!hashSet2.contains(file6)) {
                    file6.getAbsolutePath();
                    lpn1Var.a().getAbsolutePath();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(g2o1Var.g(), "native-libraries");
                    g2o1.e(file7);
                    if (!parentFile.equals(file7)) {
                        eg.m("File to remove is not a native library");
                        return null;
                    }
                    g2o1.c(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(lpn1 lpn1Var, HashSet hashSet, tso1 tso1Var) throws IOException {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            cvo1 cvo1Var = (cvo1) it.next();
            String strB = lpn1Var.b();
            String str = cvo1Var.a;
            g2o1 g2o1Var = this.a;
            g2o1Var.getClass();
            File file = new File(g2o1Var.g(), "native-libraries");
            g2o1.e(file);
            File fileD = g2o1.d(file, strB);
            g2o1.e(fileD);
            File fileD2 = g2o1.d(fileD, str);
            boolean z = false;
            if (fileD2.exists() && fileD2.length() == cvo1Var.b.getSize() && !fileD2.canWrite()) {
                z = true;
            }
            tso1Var.b(cvo1Var, fileD2, z);
        }
    }
}
