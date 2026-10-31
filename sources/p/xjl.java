package p;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xjl {
    public final ArrayList a = new ArrayList();
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public final void a(String str, ArrayList arrayList) {
        Object objPrevious;
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (arrayList.isEmpty()) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            ArrayList arrayList2 = this.a;
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!u890.j(((wjl) objPrevious).a, str));
            wjl wjlVar = (wjl) objPrevious;
            if (wjlVar != null) {
                wjlVar.d.addAll(arrayList);
                e();
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void b(String str) {
        Object objPrevious;
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ArrayList arrayList = this.a;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!u890.j(((wjl) objPrevious).a, str));
            wjl wjlVar = (wjl) objPrevious;
            if (wjlVar != null) {
                wjlVar.d.clear();
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final ArrayList c() {
        ReentrantReadWriteLock.ReadLock lock = this.b.readLock();
        lock.lock();
        try {
            ArrayList<wjl> arrayList = this.a;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (wjl wjlVar : arrayList) {
                String str = wjlVar.b;
                smc0 smc0VarN = k4p1.n();
                ArrayList<sjl> arrayList3 = wjlVar.c;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (sjl sjlVar : arrayList3) {
                    arrayList4.add(new tjl(sjlVar.a, Long.valueOf(sjlVar.b), Long.valueOf(sjlVar.c), sjlVar.d, sjlVar.e));
                }
                smc0VarN.addAll(arrayList4);
                ArrayList<vjl> arrayList5 = wjlVar.d;
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                for (vjl vjlVar : arrayList5) {
                    arrayList6.add(new tjl(vjlVar.a, (Long) null, (Long) null, vjlVar.b, z6x.a));
                }
                smc0VarN.addAll(arrayList6);
                arrayList2.add(new ujl(str, k4p1.k(smc0VarN)));
            }
            return arrayList2;
        } finally {
            lock.unlock();
        }
    }

    public final void d(String str, String str2) {
        int iNextIndex;
        Object objPrevious;
        ArrayList arrayList = this.a;
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (u890.j(((wjl) listIterator.previous()).a, str)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            if (iNextIndex != -1 && iNextIndex == p7h.L(arrayList) && ((wjl) arrayList.get(iNextIndex)).c.isEmpty()) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator2.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator2.previous();
            } while (!u890.j(((wjl) objPrevious).a, str));
            wjl wjlVar = (wjl) objPrevious;
            ArrayList arrayList2 = wjlVar != null ? wjlVar.d : null;
            if (arrayList2 == null) {
                arrayList2 = z6x.a;
            }
            if (wjlVar != null) {
                wjlVar.d = new ArrayList();
            }
            arrayList.add(new wjl(str, str2, new ArrayList(), new ArrayList(arrayList2)));
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void e() {
        while (true) {
            ArrayList<wjl> arrayList = this.a;
            int size = 0;
            for (wjl wjlVar : arrayList) {
                size += wjlVar.d.size() + wjlVar.c.size();
            }
            if (size <= 100) {
                return;
            }
            wjl wjlVar2 = (wjl) o7h.q0(arrayList);
            if (!wjlVar2.c.isEmpty()) {
                wjlVar2.c.remove(0);
            } else if (!wjlVar2.d.isEmpty()) {
                wjlVar2.d.remove(0);
            }
            wjl wjlVar3 = (wjl) o7h.q0(arrayList);
            if (wjlVar3.c.isEmpty() && wjlVar3.d.isEmpty()) {
                arrayList.remove(0);
            }
        }
    }
}
